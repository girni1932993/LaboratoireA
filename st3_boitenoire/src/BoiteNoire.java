public class BoiteNoire {

    public static void main(String[] args){

        //Declaration des variables
        double mVolSphere, poidsSphere, rayonSphere, volumeSphere;
        double mVolSubstanceIsolation, poidsSubstanceIsolation, volumeSubstanceIsolation, quantiteSubstanceIsolation;
        double poidsBoite, volumeBoite, poidsTotal;

        //Valeurs des variables
        mVolSphere = 3517;
        rayonSphere = 2.15;
        mVolSubstanceIsolation = 13545.88;
        volumeBoite = 125;
        poidsBoite = 375;

        //Operations (sphere)
        volumeSphere = (4*Math.PI*Math.pow(rayonSphere, 3))/3;
        poidsSphere = mVolSphere*volumeSphere;

        //Operations (substance isolation)
        volumeSubstanceIsolation = volumeBoite - volumeSphere;
        poidsSubstanceIsolation = mVolSubstanceIsolation*volumeSubstanceIsolation;
        quantiteSubstanceIsolation = volumeSubstanceIsolation*1000;

        //Operations (poids total)
        poidsTotal = poidsSphere + poidsSubstanceIsolation + poidsBoite;

        //Affichage des resultats
        System.out.println("-------------------------------------------");
        System.out.println("-RAPPORT D'INFORMATIONS");
        System.out.println("  Sphere");
        System.out.println("   * Masse volumique : " + mVolSphere + " kg/m3");
        System.out.println("   * Poids : " + poidsSphere + " kg");
        System.out.println("   * Rayon : " + rayonSphere + " m");
        System.out.println("   * Volume : " + volumeSphere + " m3");
        System.out.println("  Substance isolante");
        System.out.println("   * Masse volumique : " + mVolSubstanceIsolation + " kg/m3");
        System.out.println("   * Poids : " + poidsSubstanceIsolation + " kg");
        System.out.println("   * Volume : " + volumeSubstanceIsolation + " m3");
        System.out.println("   * Quantite: " + quantiteSubstanceIsolation+ " l");
        System.out.println("  Boite noire");System.out.println("   * Poids : " + poidsBoite+ " kg");
        System.out.println("   * Volume : " + volumeBoite + " m3");
        System.out.println("   * Poids total : " + poidsTotal + " kg");
        System.out.println("-------------------------------------------");
    }
}