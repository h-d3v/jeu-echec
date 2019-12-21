package jeuEchec;

import jeuEchec.modele.DAOException;
import jeuEchec.modele.Joueur;
import jeuEchec.modele.JoueurDAO;

public class testCara {
    public static void main(String[] args) {

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                // System.out.println("c"+i+j+".setId("+"\""+i+j+"\");");
                //System.out.println("@FXML");
                // System.out.println("private Button c"+i+j+";");
                // System.out.println("else if(piece.getCoordonneesEnString().equals(c"+i+j+".getId())){");
                System.out.println(" else if (evt.getTarget() == c"+i+j+"){\n" +
                        "                pieceId = c"+i+j+".getId();\n" +
                        "                decoller=false;\n" +
                        "                 c"+i+j+".setText(\"\");\n" +
                        "            }");



               /* System.out.println("else if(evt.getTarget()==c"+i+j+"){\n" +
                        "\n" +
                        "                int destX= Integer.parseInt(c"+i+j+".getId().substring(0,1));\n" +
                        "                int destY=Integer.parseInt(c"+i+j+".getId().substring(1,2));\n" +
                        "                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);\n" +
                        "                decoller=true;\n" +
                        "                c"+i+j+".setText(echiquier.getPieceParCoordonnees(destX,destY).toString());\n" +
                        "            }");

                //System.out.println("}");

*/
            }
        }
    }
}