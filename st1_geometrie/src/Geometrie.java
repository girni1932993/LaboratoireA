public class Geometrie {

    public static void main(String[] args) {

        //Declaration des variables
        double rCercle;
        double cCube;
        double rCylindre;
        double hCylindre;
        double rCone;
        double hCone;

        double surfaceCercle;
        double surfaceCube;
        double volumeCube;
        double surfaceCylindre;
        double volumeCylindre;
        double aCone;
        double surfaceCone;
        double volumeCone;

        //Valeurs
        rCercle = 10.0;
        cCube = 7.0;
        rCylindre = 10.0;
        hCylindre = 5.0;
        rCone = 3.0;
        hCone = 7.0;

        //Operations (cercle)
        surfaceCercle = Math.PI*(Math.pow(rCercle, 2));

        //Operations (cube)
        surfaceCube = 6*(Math.pow(cCube, 2));
        volumeCube = Math.pow(cCube, 3);

        //Operations (cylindre)
        surfaceCylindre = (2*Math.PI*rCylindre*hCylindre)+(2*Math.PI*Math.pow(rCylindre, 2));
        volumeCylindre = Math.PI*Math.pow(rCylindre, 2)*hCylindre;

        //Operations (cone)
        aCone = Math.sqrt(Math.pow(rCone, 2)+Math.pow(hCone, 2));
        surfaceCone = (Math.PI*(Math.pow(rCone, 2)))+(Math.PI*rCone*aCone);
        volumeCone = ((Math.PI*(Math.pow(rCone, 2)))*hCone)/3;

        //Affichage des resultats (cercle)
        System.out.println("Le cercle");
        System.out.println("- Rayon    : "+ rCercle);
        System.out.println("- Surface  : "+ surfaceCercle);

        //Affichage des resultats (cube)
        System.out.println("Le cube");
        System.out.println("- Longueur : "+ cCube);
        System.out.println("- Surface  : "+ surfaceCube);
        System.out.println("- Volume   : "+ volumeCube);

        //Affichage des resultats (cylindre)
        System.out.println("Le cylindre");
        System.out.println("- Rayon    : "+ rCylindre);
        System.out.println("- Hauteur  : "+ hCylindre);
        System.out.println("- Surface  : "+ surfaceCylindre);
        System.out.println("- Volume   : "+ volumeCylindre);

        //Affichage des resultats (cone)
        System.out.println("Le cone");
        System.out.println("- Rayon    : " + rCone);
        System.out.println("- Hauteur  : " + hCone);
        System.out.println("- Apotheme : " + aCone);
        System.out.println("- Surface  : " + surfaceCone);
        System.out.println("- Volume   : " + volumeCone);
    }
}