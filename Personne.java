public class Personne {

    //Attributs
    private int age;
    private String nom;
    //Constructeurs

    /**
     *  constructeur vide (ne fait rien)
     */

    public Personne() {}

    /**
     *  constructeur par copie
     */

    public Personne(Personne p) {
        this.age = p.getAge();
        this.nom = p.getNom();
    }

    /**
     *  initialise la Personne courante avec nom, age
     */

    public Personne(String n, int a) {
        this.age = a;
        this.nom = n;
    }

    //Methodes
    
    /**
     *  retourne true si la Personne o a les mêmes caractèristiques
     *  que la Personne courante
     */

    public boolean equals (Object o) {

        Personne po = (Personne) o;
        return this.nom.equals(po.getNom()) && this.age == po.getAge();
    }

    /**
     *  retourne l'age de la Personne courante
     */

    public int getAge() {
        return this.age;
    }

    /**
     *  retourne le nom de la Personne courante
     */

    public String getNom() {
        return this.nom;
    }

    /**
     *  initialise interactivement la Personne courante
     */

    public void init() {
        this.nom = Lire.jString("Entrez un nom. ");
        this.age = Lire.jint("Entrez un age. ");
    }

    /**
     *  retourne la chaîne de caractères représentant la Personne courante
     */

    public String toString() {
        return "Nom : " + this.nom + "\nAge : " + this.age;
    }

}
