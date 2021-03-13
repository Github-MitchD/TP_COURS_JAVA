import java.util.Scanner;

public class Exo {

    public static void main(String[] args) {
//        crepeInteractive();
//        boulangerieInteractive();
//        int res = multiplyFromConsole();
//        System.out.println("Result = " + res);
//        maxInteractive();
        heureModulo(432124);
        //432124 secondes -> 7202 minutes + 4 secondes
        //7202minutes -> 432 120 secondes
        //secondes restantes -> 4

        //7202m -> 120h + 2 minute
        //120h -> 7200m
    }

    // Exo1 (slide30-32) - Methode qui demande à l'utilisateur un nombre de crepes voulus
    //  et affiche dans la console la farine et nombre d'oeufs necessaire via methode crepe
    public static void crepeInteractive() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donnez un nombre de crêpe: ");
        int nbCrepe = scanner.nextInt();
        crepe(nbCrepe);
    }
    public static void crepe(int nbCrepe) {
        System.out.println("Pour " + nbCrepe + " crêpes, il faut : ");
        int farine = nbCrepe * 20;
        System.out.println("- " + farine + "g de farine");
        int oeufs = (nbCrepe / 5) + 1;
        System.out.println("- " + oeufs + " oeufs");
    }

    //Exo2-1 (slide37)
    //Methode boulangerie(int nbCroissant, int nbBaguette) affichant le prix total
    //sachant qu'un croissant coute 1.10€ et une baguette 0.9€
    public static void boulangerie(int nbC, int nbB) {
        double total = 1.1 * nbC + 0.9 * nbB;
        System.out.println("Total: " + total + " €");
    }
    //Exo2-2 (slide37)
    //Créer une méthode boulangerieInteractive() qui demande dans la console
    //le nombre de baguette et de croissant et appelle boulangerie()
    public static void boulangerieInteractive(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de croissant ? ");
        int nbC = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Combien de baguette ? ");
        int nbB = scanner.nextInt();
        scanner.nextLine();

        boulangerie(nbC, nbB);
    }

    //Exo 3-1 (slide39)
    //Créez la méthode readIntFromConsole() qui retourne (n’affiche pas) 1 et un seul entier lu sur la console
    public static int readIntFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donnez un nombre : ");
        int nbC = scanner.nextInt();
        scanner.nextLine();
        return nbC;
    }
    //Exo 3-2 (slide39)
    //Créer une autre méthode multiplyFromConsole(), qui demande 2 entiers sur la console
    //(appele 2 fois la méthode readIntFromConsole), et retourne leur multiplication
    public static int multiplyFromConsole() {
        //version 1
        //int v1 =  readIntFromConsole();
        //int v2 =  readIntFromConsole();
        //return v1 * v2;

        //version 2
        return readIntFromConsole() * readIntFromConsole();
    }

    //Exo 4-1 (slide60)
    //Methode max(int a, int b, int c) qui retourne le plus grand des trois
    public static int max(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else if(b > a && b > c){
            return b;
        } else {
            return c;
        }
    }
    //Exo 4-2 (slide60)
    //Methode maxInteractive qui demande 3 chiffres dans console et affiche le + grand avec max()
    public static void maxInteractive(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donnez 1er nombre: ");
        int val1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Donnez 2e nombre: ");
        int val2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Donnez 3e nombre: ");
        int val3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Le + grand est: " + max(val1, val2, val3));
    }

    //Exo 5 (slide61)
    //Trouver le if qui correspond à la plage
    public static void exoIf(int x) {
        //[-2  5] [15  27[
        if ((x >= -2 && x <= 5) || (x >= 15 && x < 27)) {
        }
        //[5  25] [12  48[ -> [5 48[
        if ((x >= 5 && x < 48)) {
        }
        //[-5  +infini[
        if (x >= -5) {
        }
        //[2  18] [40][50][60 +infini[
        if ((x >= 2 && x <= 18) || x == 40 || x == 50 || x >= 60) {
        }
        //[2  18] ]40[[50][60 +infini[
        if ((x >= 2 && x <= 18) || x == 50 || x >= 60) {
        }
        //]-infini 0[ ]0 +infini[
        if (x != 0) {
        }
        //]-inf  +inf[
    }

    //Affiche dans la console le nombre heure minute seconde
    //Exemple 123 -> 0h 2m 3s
    public static void heure(int seconde) {
        int nbMin = seconde / 60;
        int nbSeconde = seconde - (nbMin * 60);
        int nbHeure = nbMin / 60;
        nbMin = nbMin - (nbHeure * 60);
        System.out.println(nbHeure + "h " + nbMin + "m " + nbSeconde + "s");
    }
    public static void heureModulo(int seconde) {
        int nbMin = seconde / 60;
        int nbSeconde = seconde % 60;
        int nbHeure = nbMin / 60;
        nbMin = nbMin % 60;
        System.out.println(nbHeure + "h " + nbMin + "m " + nbSeconde + "s");
    }

}
