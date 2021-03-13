import java.util.Random;

public class ExoArray {

    public static void main(String[] args) {

//        Créer un tableau de taille 5 contenant les valeurs (2, 5, 8, 12 et 20)
        int[] tab = new int[]{2, 5, 8, 12, 20};

//        Afficher sa case numéro 4
        System.out.println("4eme case=" + tab[3]);

//        Dans sa case numéro 3 mettre la valeur 12
        tab[2] = 12;

//        Afficher la taille du tableau
        System.out.println("taille : " + tab.length);

//        Remplir le tableau avec que des 1

        for (int i = 0; i < tab.length; i++) {
            tab[i] = 1;
        }

        //Incrémenter de 1 chaque case {2 ,4, 7} -> { 3, 5, 8}
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab[i] + 1;
        }

        // En partant de la valeur de la 1ere case,
        // faire en sorte que chaque case suivante incrémente de 1. Exemple 1er case 3 -> { 3, 4, 5 ,6 ,7 ,8}
        //V1
        int first = tab[0];
        for (int i = 1; i < tab.length; i++) {
            first++;
            tab[i] = first;
        }

        //V2
        for (int i = 1; i < tab.length; i++) {
            tab[i] = tab[i - 1] + 1;
        }

        //Pour chaque case, afficher la position et sa valeur. 0:3 1:5 3:8
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + " : " + tab[i]);
        }

        //Afficher combien de case contiennent une valeur pair
        int nbPair = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                //la valeur est pair
                nbPair++;
            }
        }
        System.out.println("Il y a " + nbPair + " nombre pair dans le tableau");

        int temp = 0;
        testTab(temp, tab);
        //ici que deviennent temp et tab
        System.out.println();

        fillTab(tab);
        printTab(tab);
        int max = getMax(tab);
        System.out.println("max=" + max);

        permute(tab, 0, 3);
        printTab(tab);
    }

    public static int nbApparitionMaximum1For(int[] tab) {
        int nbValue = 1;
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
                nbValue = 0;
            } else if (tab[i] == max) {
                nbValue++;
            }
        }
        return nbValue;
    }

    public static int nbApparitionMaximum(int[] tab) {
        int nbValue = 0;
        double max = getMax(tab);
        for (int v : tab) {
            if (v == max) {
                nbValue++;
            }
        }
        return nbValue;
    }

    public static double moyenne(int[] tab) {
        return somme(tab) / (double) tab.length;
    }

    //Permute l’emplacement i et j dans le tableau
    public static int somme(int[] tab) {
        int somme = 0;
        for (int v : tab) {
            somme += v;
        }
        return somme;
    }

    //Permute l’emplacement i et j dans le tableau
    public static void permute(int[] tab, int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }

    //Retourne la valeur maximum du tableau
    public static int getMax(int[] tab) {
        //int max = tab[0];
        int max = Integer.MIN_VALUE;

        //version fori
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        //version foreach
        for (int value : tab) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    //Rempli le tableau de valeurs aléatoires comprises entre 0 et99
    public static void fillTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(100);
        }
    }

    //Affiche le tableau dans la console sur 1 seule ligne
    public static void printTab(int[] tab) {
        //Version avec un indice
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

//        //version foreach (uniquement pour de la lecture
//        for (int value : tab) {
//            System.out.print(value + " ");
//        }
    }

    public static void testTab(int p1, int[] tab) {
        p1++;
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }
    }
}
