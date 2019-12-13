package jeuEchec.modele;
/*
 * Classe d'accès aux données générique
 *
 */
public abstract class DAO<T> {

    /**
     * Lit un objet à partir de son id
     *
     * @param id L'identifiant unique de l'objet à lire
     * @return l'objet lu ou null si l'objet n'a pu être lu
     *
     */
    public abstract T lire(Object id) throws DAOException;

    /**
     * Crée un nouvel objet
     *
     * @param objet l'objet à ajouter dans la source de données
     * @return l'objet tel qu'il a été créé dans la source de données
     */
    public abstract T créer(T objet) throws DAOException;

    /**
     * Modifie un objet dans la source de données
     *
     * @param objet l'objet à modifier dans la source de données
     * @return l'objet tel qu'il a été modifié dans la source de données
     */
    public abstract T modifier(T objet) throws DAOException;

    /**
     * Supprime un objet de la source de données
     *
     * @param objet l'objet à supprimer de la source de données
     * @return l'objet supprimé ou null s'il n'a pas été trouvé
     */
    public abstract T supprimer(T objet) throws DAOException;

}
