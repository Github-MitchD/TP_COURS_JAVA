import beans.MaisonBean;

import java.util.Random;

public class ExoMaisonUtils {

    public static void main(String[] args) {
        //-----------------------
        //EXO Maison par Maison
        //-----------------------
//        beans.MaisonBean m1 = new beans.MaisonBean();
//        m1.largeur = 10;
//        m1.longueur = 20;
//        m1.couleur = "Bleu";
//        printMaison(m1);
//        doubleMaison(m1);
//        printMaison(m1);
//
//        beans.MaisonBean m2 = new beans.MaisonBean();
//        m2.largeur = 20;
//        m2.longueur = 40;
//        m2.couleur = "Rouge";
//        printMaison(m2);
//
//        beans.MaisonBean max = bigMaison(m1, m2);
//        printMaison(max);

        //-----------------------
        //EXO Tableau de maison
        //-----------------------
        MaisonBean[] tabNull = null;
        createMaisons(tabNull);

        //Ici 0 maison mais 5 emplacements
        MaisonBean[] tab = new MaisonBean[5];
        createMaisons(tab);
    }

    public static void printMaisons(MaisonBean[] tab) {
        //Affiche les maisons
        //Question :  si des cases de mon tableau sont nulles
        //Question :  si mon tableau est nulle
    }

    public static void createMaisons(MaisonBean[] tab) {
        if (tab != null) {
            for (int i = 0; i < tab.length; i++) {
                //V1
                MaisonBean temp = new MaisonBean();
                temp.largeur = new Random().nextInt(100);
                temp.longueur = new Random().nextInt(100);
                tab[i] = temp;

                //V2
                tab[i] = new MaisonBean();
                tab[i].largeur = new Random().nextInt(100);
                tab[i].longueur = new Random().nextInt(100);
            }
        }
    }

    public static void printMaison(MaisonBean m) {
        if (m == null) {
            System.out.println("Maison null");
        } else {
            System.out.println(m.largeur + "x" + m.longueur + " : " + m.couleur);
        }
    }

    public static void doubleMaison(MaisonBean m) {
        if (m != null) {
            m.largeur = m.largeur * 2;
            m.longueur *= 2;
        }
    }

    public static MaisonBean bigMaison(MaisonBean m1, MaisonBean m2) {
        if (m1 == null) {
            return m2;
        } else if (m2 == null) {
            return m1;
        } else if (m1.longueur * m1.largeur > m2.longueur * m2.largeur) {
            return m1;
        } else if (m1.longueur * m1.largeur < m2.longueur * m2.largeur) {
            return m2;
        } else {
            return null;
        }
    }
}
