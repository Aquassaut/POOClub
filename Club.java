import java.util.ArrayList;

public class Club {

    //Attributs
    private ArrayList<Personne> adherents = new ArrayList<Personne>();
    private String nomClub;

    //Constructeurs

    /**
     *  Constructeur vide
     */

    public Club() {}
    
    /**
     *  Constructeur par copie
     */

    public Club(Club c) {
        this.nomClub = c.getNomClub();
        for (int a = 0; a < c.getAdherents().size(); a += 1) {
        //Itère sur chaque adhérent du club copié et détermine sa classe
        //pour procéder à la copie adéquate
            if (c.getAdherents().get(a) instanceof Etudiant) {
                //Appel du constructeur par copie de la classe Etudiant
                //On accède à l'instance d'Etudiant grâce à la méthode
                //get(int) de la classe ArrayList appliquée à l'ArrayList
                //c.adherents renvoyé par la méthode d'accès getAdherents()
                //de la classe Club.
                Etudiant o = new Etudiant((Etudiant) c.getAdherents().get(a));
                this.adherents.add(o);
            }
            else if (c.getAdherents().get(a) instanceof Salarie) {
                Salarie o = new Salarie((Salarie) c.getAdherents().get(a));
                this.adherents.add(o);
            }
            else if (c.getAdherents().get(a) instanceof Personne) {
                Personne o = new Personne((Personne) c.getAdherents().get(a));
                this.adherents.add(o);
            }
        }
    }

    /**
     *  Constructeur prenant un nom et une ArrayList d'adhérents comme
     *  paramètre
     */

    public Club(String unNomClub, ArrayList<Personne> desAdherents) {
        this.nomClub = unNomClub;
        this.adherents.addAll(desAdherents);
    }

    //Methodes
    
    /**
     *  Methode d'accès à la liste d'adhérents du club instancié.
     */

    public ArrayList getAdherents() {
        return this.adherents;
    }

    /**
     *  Méthode d'accès au nom du club instancié.
     */

    public String getNomClub() {
        return this.nomClub;
    }

    /**
     *  Méthode d'initialisation interactive du club instancié.
     */

    public void init() {
        this.nomClub = Lire.jString("Veuillez entrer un nom pour le club. ");
        //Demande à l'utilisateur et récupère le nom du club
        int nbAd = Lire.jint("Veuillez entrer un nombre d'adhérents à affecter. ");
        //Demande à l'utilisateur et récupère le nombre d'adhérents à placer dans la
        //nouvelle liste
        for (int a = 0; a < nbAd; a += 1) {
            System.out.println("Si l'adhérent n°" + (a+1) +
                    " est étudiant entrez 1." +
                    "\nSi il est salarié, entrez 2." + 
                    "\nSi il n'est ni l'un ni l'autre, tapez 0.");
            //Demande du type d'adhérent à ajouter, selon un code de classe
            int adType = Lire.jint();
            if (adType == 1) {
                Etudiant o = new Etudiant();
                o.init();
                //Délégation de la méthode init de la classe concernée.
                this.adherents.add(o);
            }
            else if (adType == 2) {
                Salarie o = new Salarie();
                o.init();
                this.adherents.add(o);
            }
            else if (adType == 0) {
                Personne o = new Personne();
                o.init();
                this.adherents.add(o);
            }
        }
    }

    /**
     *  Redéfinition de la méthode toString pour lui faire afficher des
     *  information pertinentes.
     */

    public String toString() {
        String adherList = "";
        for (int a = 0; a < this.adherents.size(); a += 1) {
            //Object o = this.adherents.get(a); TEST
            adherList += "\nPersonne n°" + (a+1) + " :\n" + this.adherents.get(a);
        }
        return "Nom du club : " + this.nomClub + 
               "\nListe des adherents : " + adherList;
    }
}
