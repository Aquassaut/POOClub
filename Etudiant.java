public class Etudiant extends Personne {

    //Attributs
    private String numeroEtudiant;
    private String faculte;

    //Constructeurs
    public Etudiant() {}
    
    public Etudiant(Etudiant e) {
        super(e);
        this.numeroEtudiant = e.getNumeroEtudiant();
        this.faculte = e.getFaculte();
    }

    public Etudiant(String unNom, int unAge, String unNumeroEtudiant, String uneFac) {
        super(unNom, unAge);
        this.numeroEtudiant = unNumeroEtudiant;
        this.faculte = uneFac;
    }

    //Methodes
    
    public boolean equals(Object o) {
        Etudiant eo = (Etudiant) o;
        return super.equals(o) &&
               this.numeroEtudiant.equals(eo.getNumeroEtudiant()) &&
               this.faculte.equals(eo.getFaculte());
    }

    public String getFaculte() {
        return this.faculte;
    }

    public String getNumeroEtudiant() {
        return this.numeroEtudiant;
    }

    public void init() {
        super.init();
        this.numeroEtudiant = Lire.jString("Entrez un numéro étudiant. ");
        this.faculte = Lire.jString("Entrez une faculté. ");
    }

    public String toString() {
        return super.toString() + "\nNumero Etudiant : " +
               this.numeroEtudiant + "\nFaculte : " + this.faculte;
    }

}
