import java.util.Scanner;

public class ExoFor {
    public static void main(String[] args) {
        String phrase = "  UnE phrase avec des e";

        String sanslesE = sanslesE(phrase);
        System.out.println("sanslesE=" + sanslesE);

        int nbA = nbA(phrase);
        System.out.println("nbA=" + nbA);

        String aLenvers = aLenversV2(phrase);
        System.out.println("aLenvers=" + aLenvers);

        int nbMaj = nbMaj(phrase);
        System.out.println("nbMaj=" + nbMaj);

        String sansLesVoyelles = sansLesVoyelles(phrase);
        System.out.println("sansLesVoyelles=" + sansLesVoyelles);

        String sanslesMaj = sanslesMaj(phrase);
        System.out.println("sanslesMaj=" + sanslesMaj);

        //pour ne prendre en compte que des minuscules je retire les majuscules
        char plusGrandChar = lettreLaPlusGrande(sanslesMaj(phrase));
        int plusGrandCharint = plusGrandChar;
        System.out.println("plusGrandChar=" + plusGrandChar);
        System.out.println("plusGrandCharint=" + plusGrandCharint);

        String retirerEspaceDebutV2 = retirerEspaceDebutV2(phrase);
        System.out.println("retirerEspaceDebutV2=" + retirerEspaceDebutV2);

//        long debut = System.currentTimeMillis();
//        for (long i = 0; i < 10000000; i++) {
//            String remplacerEspace = remplacerEspace(phrase);
//            //System.out.println("remplacerEspace=" + remplacerEspace);
//        }
//        System.out.println("terminer en " + (System.currentTimeMillis() - debut));
//
//        debut = System.currentTimeMillis();
//        for (long i = 0; i < 10000000; i++) {
//            phrase.replace(' ', '_');
//        }
//        System.out.println("terminer en " + (System.currentTimeMillis() - debut));

        exoFor();
    }

    public static void exoFor() {
//        Afficher les nombres de 0 à 10
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Afficher les nombres de 5 à 12
        for (int i = 5; i <= 12; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Afficher uniquement les nombres paires de 4 à 48
        for (int i = 4; i <= 48; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Afficher les nombres de 10 à 0
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Afficher les nombres de 0 à 10 2 fois, exemple 0 0 1 1 2 2 3 3...
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " " + i + " ");
        }
        System.out.println();

//        Afficher les nombres de 0 à 20, 2 fois si impaire 1 fois si pair. Exemple 0 1 1 2 3 3 4 ...
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) { //pair
                System.out.print(i + " ");
            }
            System.out.print(i + " ");
        }
        System.out.println();

//        Afficher : 1     1    2    3    5    8    13    21 ... jusqu'à 987
        //           i0   i1
        System.out.print("1 1 ");
        for (int i1 = 1, i0 = 1; i1 < 987; ) {
            int temp = i0 + i1;
            System.out.print(temp + " ");
            i0 = i1;
            i1 = temp;
        }
        System.out.println();

//        Demander à l'utilisateur un nombre et recommencez jusqu'à ce que ce nombre soit 0

        for (int userNumber = 1; userNumber != 0; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Donnez un chiffre : ");
            userNumber = scanner.nextInt();
        }

//        Afficher les nombres de 0 à 10 30 fois chacun (boucle for dans une boucle for) en retournant à la ligne à chaque changement de nombre.
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static String remplacerEspace(String entrer) {
        String sortie = "";
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            if (c == ' ') {
                sortie += '_';
            } else {
                sortie += c;
            }
        }
        return sortie;
    }

    public static String retirerEspaceDebutV2(String entrer) {
        String sortie = "";
        int i1erChar = 0;
        //Je me place sur le 1er caractère qui n'est pas un espace
        while (i1erChar < entrer.length() && entrer.charAt(i1erChar) == ' ') {
            i1erChar++;
        }
        for (int i = i1erChar; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            sortie += c;
        }
        return sortie;
    }

    public static String retirerEspaceDebut(String entrer) {
        String sortie = "";
        boolean onARencontrerDesLettre = false;

        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);

            if (c != ' ') {
                sortie += c;
                //On a rencontré autre chose qu'un espace
                onARencontrerDesLettre = true;
            }
            //peut etre je retire peut etre pas
            else if (onARencontrerDesLettre) {
                sortie += ' ';
            }
        }
        return sortie;
    }

    //Une phrase avec des e -> Un phras avc ds
    public static char lettreLaPlusGrande(String entrer) {
        char sortie = 0;
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            //j'applique la transformation
            if (c > sortie) {
                sortie = c;
            }
        }
        return sortie;
    }

    //Une phrase avec des e -> Un phras avc ds
    public static String sanslesMaj(String entrer) {
        String sortie = "";
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            //j'applique la transformation
            if (c < 'A' || c > 'Z') {
                sortie += c; //Ajoute
            }
        }
        return sortie;
    }

    //Une phrase avec des e -> Un phras avc ds
    public static String sansLesVoyelles(String entrer) {
        String sortie = "";
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            //j'applique la transformation
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y') {
                sortie += c; //Ajoute
            }
        }
        return sortie;
    }

    public static int nbMaj(String entrer) {
        int sortie = 0;
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            //traitement
            if (c >= 'A' && c <= 'Z') {
                sortie++;
            }
        }
        return sortie;
    }

    //On parcourt à l'envers
    public static String aLenversV2(String entrer) {
        String sortie = "";

        //c: a b c d (Taille de 4)
        //i: 0 1 2 3
        for (int i = entrer.length() - 1; i >= 0; i--) {
            char c = entrer.charAt(i);
            sortie += c; //Ajoute
        }
        return sortie;
    }

    //On met les caractères lus avant
    public static String aLenvers(String entrer) {
        String sortie = "";
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            sortie = c + sortie; //Ajoute
        }
        return sortie;
    }

    public static int nbA(String entrer) {
        int sortie = 0;
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            //traitement
            if (c == 'a' || c == 'A') {
                sortie++;
            }
        }
        return sortie;
    }

    //Une phrase avec des e -> Un phras avc ds
    public static String sanslesE(String entrer) {
        String sortie = "";
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            //j'applique la transformation
            if (c != 'e' && c != 'E') {
                sortie += c; //Ajoute
            }
        }
        return sortie;
    }
}