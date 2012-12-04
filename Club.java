import java.util.ArrayList;

public class Club {

    //Attributs
    private ArrayList adherents;
    private String nomClub;

    //Constructeurs

    public Club() {}
    
    public Club(Club c) {
        this.adherents = new ArrayList();
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

    public Club(String unNomClub, Personne desAdherents[]) {
        this.nomClub = unNomClub;
        this.adherents = desAdherents;
    }

    //Methodes

    public ArrayList getAdherents() {
        return this.adherents;
    }

    public String getNomClub() {
        return this.nomClub;
    }

    public void init() {
        int nbAd = 50; //CONFIG
        System.out.println("Veuillez entrer un nombre d'adhérents à affecter");
        //Faire des trucs avec Lire
        for (int a = 0; a < nbAd; a += 1) {
            System.out.println("Si l'adhérent n°" + a + " est étudiant entrez 1." +
                    "\nSi il est salarié, entrez 2." + 
                    "\nSi il n'est ni l'un ni l'autre, tapez 0.");
            int adType = 0; //Faire des trucs avec Lire
            if (adType == 1) {
                Etudiant o = new Etudiant();
                this.adherents[a] = o;
                o.init();
            }
            else if (adType == 2) {
                Salarie o = new Salarie();
                this.adherents[a] = o;
                o.init();
            }
            else if (adType == 0) {
                Personne o = new Personne();
                this.adherents[a] = o;
                o.init();
            }
        }
    }

    public String toString() {
        String adherList = "";
        for (int a = 0; a < this.adherents.length; a += 1) {
            Object o = this.adherents[a];
            adherList += "\nPersonne n°" + (a+1) + " :\n" + o;
        }
        return "Nom du club : " + this.nomClub + 
               "\nListe des adherents : " + adherList;
    }
}
