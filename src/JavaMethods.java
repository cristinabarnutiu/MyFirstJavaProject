public class JavaMethods {
    public static void main(String[] args) {
        metoda1();//test
        metoda1();
        metoda1();
        metoda2("Cristina");
        metoda2("Gelu");
        sum(4,6);
        sum(5,7);
        metoda3("Crina",20);
        metoda3("Dana",19);
        sum(3.00,2.5);
        sum(3,2,7);
        int result=sumReturn(5,5);
        System.out.println(result);
        System.out.println(sumReturn(4,4));
        System.out.println(stringReturn("capsuni"));
        System.out.println(calculeazaNrCaractere("Australia"));
        System.out.println((sumRecursiv(1,2)));
        System.out.println((sumRecursiv2(1,2)));
        System.out.println(recursiv3("Apa"));
        System.out.println(concatenateStrings("unu","doi"));
        System.out.println(calculeazaNrCaractere2("Australia"));

    }

    private static void metoda1 (){
        System.out.println("Hello world!");
    }

    private static void metoda2(String nume){
        System.out.println("Hello "+nume);
    }
    private static void sum(int a, int b){
        System.out.println(a+b);
    }


    private static int sumRecursiv(int numar1,int numar2){
    return numar1+numar2;
    }

    private static void afiseazaCeva(){
        System.out.println("Prints something");
    }

    private static int sumRecursiv2 (int numar3, int numar4){
        int sum3 = sumRecursiv(numar3,numar4);
        afiseazaCeva();
        return sum3+1;
    }

    private static String recursiv3(String text){
        if(text.length()<50) {
            return recursiv3(text + "a");
        }
        else return text;
    }

     private static void sum(int x, int y, int z){
         System.out.println(x+y+z);
     }
     private static void sum(double a, double b){
         System.out.println(a+b);
     }

    private static void metoda3(String nume, int varsta){
        System.out.println("Ma numesc "+nume+" si am "+varsta+" ani");
    }

    private static int sumReturn(int a, int b){
        return a+b;
    }

    private static String stringReturn(String fruct){
        return ("Imi place sa manananc "+fruct);
    }


    private static int calculeazaNrCaractere(String cuvant){
        System.out.println("Cuvantul "+cuvant+" are nr de litere: ");
        return cuvant.length();
    }

    private static String concatenateStrings(String a, String b){
        return (a+b).toUpperCase();
    }

    private static int calculeazaNrCaractere2(String a){
        return a.length();
    }

}
