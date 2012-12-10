public class Salarie extends Personne {

    //Attributs
    private String numeroSecu;
    private String employeur;

    //Constructeurs

    /**
     *  constructeur vide
     */

    public Salarie() {}

    /**
     *  constructeur par copie
     */

    public Salarie(Salarie s) {
        super(s);
        this.numeroSecu = s.getNumeroSecu();
        this.employeur = s.getEmployeur();
    }

    /**
     *  initialise le Salarie courant
     */

    public Salarie(String unNom, int unAge,
                   String unNumeroSecu, String unEmployeur) {
        super(unNom, unAge);
        this.numeroSecu = unNumeroSecu;
        this.employeur = unEmployeur;
    }

    //Methodes

    /**
     *  retourne true si le Salarie référencé par o a les mêmes
     *  caractèristiques que le Salarié courant
     */

    public boolean equals(Object o) {
        Salarie so = (Salarie) o;
        return super.equals(o) &&
               this.numeroSecu.equals(so.getNumeroSecu()) &&
               this.employeur.equals(so.getEmployeur());
    }

    /**
     *  retourne l'employeur du Salarie courant
     */

    public String getEmployeur() {
        return this.employeur;
    }

    /**
     *  retourne le numéro de sécurité sociale du Salarie courant
     */

    public String getNumeroSecu() {
        return this.numeroSecu;
    }

    /**
     *  initialise interactivement le Salarie courant
     */

    public void init() {
        super.init();
        this.numeroSecu = Lire.jString("Entrez un numéro de sécurité sociale. ");
        this.employeur = Lire.jString("Entrez un nom d'employeur. ");
    }

    /**
     * retourne la chaîne de caractères représentant le Salarie courant
     */

    public String toString() {
        return super.toString() + "\nNuméro de sécu : " +
               this.numeroSecu + "\nEmployeur : " + this.employeur;
    }

}
