import java.text.DecimalFormat;
import java.util.Scanner;

public class Convertisseur2 {

    public static void main(String[] args) {

        //Declaration des variables
        int nbDeg;
        double nbRad;
        Scanner sc = new Scanner (System.in);

        //Question a l'utilisateur
        System.out.print("Quel est l'angle en degres?");
        nbDeg = sc.nextInt();

        //Operation
        nbRad = (double) (nbDeg*Math.PI/180);

        //Deux decimales
        DecimalFormat df = new DecimalFormat("#.##");

        //Resultat
        System.out.print("Valeur en radians integree : " + df.format(nbRad));

        sc.close();
    }
}