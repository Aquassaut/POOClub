import java.util.ArrayList;

public class TestClub {
    public static void main(String[] args) {
        Personne p1, p2, p3;
        Etudiant e1, e2, e3;
        Salarie s1, s2, s3;
        Club c1, c2, c3;

        p1 = new Personne("Jean", 30);
        p2 = new Personne();
        p3 = new Personne(p1);
        //p2.init();

        e1 = new Etudiant("Arnaud, pas toi, un autre", 12, "12345", "IUT BM");
        e2 = new Etudiant();
        e3 = new Etudiant(e1);
        //e2.init();

        s1 = new Salarie("Kalou Cabrera Castillos", 35, "999000777888", "IUT BM Staff");
        s2 = new Salarie();
        s3 = new Salarie(s1);
        //s2.init();

        c1 = new Club();
        c2 = new Club();
        c3 = new Club();
        ArrayList<Personne> liste = new ArrayList<Personne>();
        liste.add(p1);
        liste.add(e1);
        liste.add(s1);
        c1 = new Club("monClub", liste);
        System.out.println(c1);
        c2 = new Club();
        c2.init();
        c3 = new Club(c2);
        System.out.println("on teste le club par copie : ");
        System.out.println(c3);
    
    }


}
