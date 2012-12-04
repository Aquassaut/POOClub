import java.util.ArrayList;

public class Club {

    //Attributs
    private ArrayList<Personne> adherents = new ArrayList<Personne>();
    private String nomClub;

    //Constructeurs

    public Club() {}
    
    public Club(Club c) {
        this.nomClub = c.getNomClub();
        for (int a = 0; a < c.getAdherents().size(); a += 1) {
            if (c.getAdherents().get(a) instanceof Etudiant) {
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

    public Club(String unNomClub, ArrayList<Personne> desAdherents) {
        this.nomClub = unNomClub;
        this.adherents.addAll(desAdherents);
    }

    //Methodes

    public ArrayList getAdherents() {
        return this.adherents;
    }

    public String getNomClub() {
        return this.nomClub;
    }

    public void init() {
        this.nomClub = Lire.jString("Veuillez entrer un nom pour le club. ");
        int nbAd = Lire.jint("Veuillez entrer un nombre d'adhérents à affecter. ");
        for (int a = 0; a < nbAd; a += 1) {
            System.out.println("Si l'adhérent n°" + a + " est étudiant entrez 1." +
                    "\nSi il est salarié, entrez 2." + 
                    "\nSi il n'est ni l'un ni l'autre, tapez 0.");
            int adType = Lire.jint(); //Faire des trucs avec Lire
            if (adType == 1) {
                Etudiant o = new Etudiant();
                o.init();
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
