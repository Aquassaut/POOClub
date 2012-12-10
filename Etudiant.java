public class Etudiant extends Personne {

    //Attributs
    private String numeroEtudiant;
    private String faculte;

    //Constructeurs
    
    /**
     *  constructeur vide
     */

    public Etudiant() {}
    
    /**
     *  constructeur par copie
     */

    public Etudiant(Etudiant e) {
        super(e);
        this.numeroEtudiant = e.getNumeroEtudiant();
        this.faculte = e.getFaculte();
    }

    /**
     *  initialise l'Etudiant courant
     */

    public Etudiant(String unNom, int unAge,
                    String unNumeroEtudiant, String uneFac) {
        super(unNom, unAge);
        this.numeroEtudiant = unNumeroEtudiant;
        this.faculte = uneFac;
    }

    //Methodes
    
    /**
     *  retourne true si l'Etudiant référencé par o a les mêmes
     *  caractèristiques que l'Etudiant courant
     */

    public boolean equals(Object o) {
        Etudiant eo = (Etudiant) o;
        return super.equals(o) &&
               this.numeroEtudiant.equals(eo.getNumeroEtudiant()) &&
               this.faculte.equals(eo.getFaculte());
    }

    /**
     *  retourne la faculté où étudie l'étudiant courant
     */

    public String getFaculte() {
        return this.faculte;
    }

    /**
     *  retourne le niméro d'étudiant de l'Etudiant courant
     */

    public String getNumeroEtudiant() {
        return this.numeroEtudiant;
    }

    /**
     *  initialise interactivementl'Etudiant courant
     */

    public void init() {
        super.init();
        this.numeroEtudiant = Lire.jString("Entrez un numéro étudiant. ");
        this.faculte = Lire.jString("Entrez une faculté. ");
    }

    /**
     *  retourne la chaine de caractères représentant l'Etudiant courant
     */

    public String toString() {
        return super.toString() + "\nNumero Etudiant : " +
               this.numeroEtudiant + "\nFaculte : " + this.faculte;
    }

}
