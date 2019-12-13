package jeuEchec.modele;

import java.util.ArrayList;

public class PartieDAO extends DAO<Partie> {
    /**
     * Lit un objet à partir de son id
     *
     * @param id L'identifiant unique de l'objet à lire
     * @return l'objet lu ou null si l'objet n'a pu être lu
     */
    @Override
    public Partie lire(Object id) throws DAOException {
        return null;
    }

    /**
     * Crée un nouvel objet
     *
     * @param objet l'objet à ajouter dans la source de données
     * @return l'objet tel qu'il a été créé dans la source de données
     */
    @Override
    public Partie créer(Partie objet) throws DAOException {
        return null;
    }

    /**
     * Modifie un objet dans la source de données
     *
     * @param objet l'objet à modifier dans la source de données
     * @return l'objet tel qu'il a été modifié dans la source de données
     */
    @Override
    public Partie modifier(Partie objet) throws DAOException {
        return null;
    }

    /**
     * Supprime un objet de la source de données
     *
     * @param objet l'objet à supprimer de la source de données
     * @return l'objet supprimé ou null s'il n'a pas été trouvé
     */
    @Override
    public Partie supprimer(Partie objet) throws DAOException {
        return null;
    }

    @Override
    public ArrayList<Partie> chercherTous() throws DAOException {
        return null;
    }
}
