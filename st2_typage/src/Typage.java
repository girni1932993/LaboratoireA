public class Typage {

    public static void main(String[] args){

        //Declaration des variables
        int var1 = 10;
        float var2 = (6/5);
        char var3 = 5;

        //Conversion 1
        String var1String = Integer.toString(var1);
        System.out.println("Conversion #1 : "+ var1String);

        //Conversion 2
        boolean var1Boolean = (var1 == 10);
        System.out.println("Conversion #2 : "+ var1Boolean);
        //Conversion impossible

        //Conversion 3
        int var2Int = (int)var2;
        System.out.println("Conversion #3 : " + var2Int);

        //Conversion 4
        String var2IntString = Integer.toString(var2Int);
        System.out.println("Conversion #4 : " + var2Int);

        //Conversion 5
        int var3Int = (int)var3;
        System.out.println("Conversion #5 : " + var3Int);
    }
}