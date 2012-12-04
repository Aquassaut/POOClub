public class Personne {

    //Attributs
    private int age;
    private String nom;
    //Constructeurs

    public Personne() {}

    public Personne(Personne p) {
        this.age = p.getAge();
        this.nom = p.getNom();
    }

    public Personne(String n, int a) {
        this.age = a;
        this.nom = n;
    }

    //Methodes

    public boolean equals (Object o) {

        Personne po = (Personne) o;
        return this.nom.equals(po.getNom()) && this.age == po.getAge();
    }

    public int getAge() {
        return this.age;
    }

    public String getNom() {
        return this.nom;
    }

    public void init() {
        this.nom = Lire.jString("Entrez un nom. ");
        this.age = Lire.jint("Entrez un age. ");
    }

    public String toString() {
        return "Nom : " + this.nom + "\nAge : " + this.age;
    }


}
