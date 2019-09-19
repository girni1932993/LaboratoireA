import java.util.Scanner;

public class Pythagore {

    public static void main(String[] args){

        //Declaration des variables
        int valeurA;
        int valeurB;
        int valeurHyp;
        Scanner sc = new Scanner(System.in);

        //Questions à l'utilisateur
        System.out.print ("Quelle est la veur du cote A ?");
        valeurA = sc.nextInt();
        System.out.print ("Quelle est la veur du cote B ?");
        valeurB = sc.nextInt();
        sc.close();

        //Operations
        valeurHyp = (int) Math.sqrt(Math.pow(valeurA,2) + Math.pow(valeurB,2) );

        //Resultats
        System.out.print ("Valeur de pythagore : " + valeurHyp);
    }
}