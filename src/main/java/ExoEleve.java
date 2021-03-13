import beans.EleveBean;

public class ExoEleve {
    public static void main(String[] args) {
        EleveBean eleve1 = null; //pas d'eleve
        EleveBean eleve2 = new EleveBean(); //Eleve sans rien
        EleveBean eleve3 = new EleveBean(); //Eleve avec nom et note

        eleve3.nom = "Mitch";
        eleve3.note = 12;

        printEleve(eleve1);
        printEleve(eleve2);
        printEleve(eleve3);

        doubleNote(eleve1);
        doubleNote(eleve2);
        doubleNote(eleve3);

        printEleve(eleve1);
        printEleve(eleve2);
        printEleve(eleve3);

        //2 null
        System.out.print("cas1 : ");
        printEleve(meilleurEleve(eleve1, eleve1));

        //1 null 1 bon
        System.out.print("cas2a : ");
        printEleve(meilleurEleve(eleve1, eleve3));

        System.out.print("cas2b : ");
        printEleve(meilleurEleve(eleve3, eleve1));

        //2 bon different
        System.out.print("cas3a : ");
        printEleve(meilleurEleve(eleve2, eleve3));
        System.out.print("cas3b : ");
        printEleve(meilleurEleve(eleve3, eleve2));

        //2 bon identique
        System.out.print("cas4 : ");
        printEleve(meilleurEleve(eleve3, eleve3));

    }

    //Affiche le nom et la note de l'eleve
    public static void printEleve(EleveBean e){
        if(e == null){
            System.out.println("Eleve n'existe pas");
        } else {
            System.out.println("Nom Eleve: " + e.nom + " | Note: " + e.note);
        }
    }
    //Double la note de l'eleve sans qu'elle ne puisse depasser 20
    public static void doubleNote(EleveBean e){
        if (e != null){
            if (e.note < 10){
                e.note *= 2;
            } else {
                e.note = 20;
            }
        }
    }
    //Retourne l'eleve qui a la meilleur note ou null en cas d'egalité
    public static EleveBean meilleurEleve(EleveBean eleve1, EleveBean eleve2){
        if(eleve1 == null){
            return eleve2;
        } else if (eleve2 == null){
            return eleve1;
        } else if (eleve1.note > eleve2.note){
            return eleve1;
        } else if (eleve2.note > eleve1.note){
            return eleve2;
        } else {
            return null;
        }
    }
}
