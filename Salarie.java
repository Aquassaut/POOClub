public class Salarie extends Personne {

    //Attributs
    private String numeroSecu;
    private String employeur;

    //Constructeurs
    public Salarie() {}

    public Salarie(Salarie s) {
        super(s);
        this.numeroSecu = s.getNumeroSecu();
        this.employeur = s.getEmployeur();
    }

    public Salarie(String unNom, int unAge,
                   String unNumeroSecu, String unEmployeur) {
        super(unNom, unAge);
        this.numeroSecu = unNumeroSecu;
        this.employeur = unEmployeur;
    }

    //Methodes

    public boolean equals(Object o) {
        Salarie so = (Salarie) o;
        return super.equals(o) &&
               this.numeroSecu.equals(so.getNumeroSecu()) &&
               this.employeur.equals(so.getEmployeur());
    }

    public String getEmployeur() {
        return this.employeur;
    }

    public String getNumeroSecu() {
        return this.numeroSecu;
    }

    public void init() {
        super.init();
        this.numeroSecu = Lire.jString("Entrez un numéro de sécurité sociale. ");
        this.employeur = Lire.jString("Entrez un nom d'employeur. ");
    }

    public String toString() {
        return super.toString() + "\nNuméro de sécu : " +
               this.numeroSecu + "\nEmployeur : " + this.employeur;
    }

}
