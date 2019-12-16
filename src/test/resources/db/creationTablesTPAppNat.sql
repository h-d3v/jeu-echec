DROP TABLE IF EXISTS Partie ;
DROP TABLE IF EXISTS Joueur ;



CREATE TABLE Joueur (
	pseudo VARCHAR(255) PRIMARY KEY
);

CREATE TABLE Partie (
	id INT PRIMARY KEY,
	pseudoJoueurBlancs VARCHAR(255) NOT NULL,
	pseudoJoueurNoirs VARCHAR(255) NOT NULL,
	mouvements TEXT NOT NULL, 
	estTerminee INT,
	temps TIME,
	vainqueur TINYINT,
	CONSTRAINT pseudoJoueurBlancs_fk FOREIGN KEY (pseudoJoueurBlancs) REFERENCES Joueur(pseudo),
	CONSTRAINT pseudoJoueurNoirs_fk FOREIGN KEY (pseudoJoueurNoirs) REFERENCES Joueur(pseudo)

);

INSERT INTO	Joueur VALUES 
	("Maolcholuim Mac Shitrig"),
	("Sin-Deny Thorpe");


INSERT INTO Partie VALUES(
	1,
	"Maolcholuim Mac Shitrig",
	"Sin-Deny Thorpe",
	"1434-6444/5023-1725/0352-0604/5256",
	0,
	'00:01:26',
	0
);

