public class Exercitii1 {
    public static void main(String[] args) {
        String text1 = "The quick brown fox jumps over the lazy dog.";
        String text2 = "This is a good text.";
        String text3 = "dog";
        String text4 = "dog";

        int legthText1 = text1.length();
        String text2Mare = text2.toUpperCase();
        String text2Mic = text2.toLowerCase();
        boolean contine = text1.contains(text3);
        String text1Inlocuit = text1.replace('o','a');
        boolean text2endsWith = text2.endsWith(".");
        boolean text1startsWith = text1.startsWith("T");
        String text1Text2 = text1.concat(text2);
        boolean suntIdentice = text3.matches(text4);
        int pozitiaLuiO = text3.indexOf('o');
        String primeleZece = text1.substring(0,9);
        System.out.println(legthText1); //1
        System.out.println(text2Mare); //2
        System.out.println(text2Mic); //3
        System.out.println(contine); //4
        System.out.println(text1Inlocuit); //5
        System.out.println(text2endsWith); //6
        System.out.println(text1startsWith); //7
        System.out.println(text1Text2); //8
        System.out.println(suntIdentice); //9
        System.out.println(pozitiaLuiO); //10
        System.out.println(primeleZece); //11

        //alternativa
        System.out.println(text1.substring(0,9));
        /*1. Inmultiti 10 cu 6. Afisati rezultatul cu functia println.
        2. Impartiti 10 la 5. Afisati rezultatul.
        3. Folositi operatorul corect in loc de “…” pentru a incrementa valoarea lui x cu 1. Afisati rezultatul.
        int x = 10;
… x;
        4. Folositi operatorul de atribuire in loc de “…” pentru a adauga valoarea 5 variabilei x. Afisati rezultatul.
        int x = 10;
        x … 5;
        5. Declarati doua variabile de tip int si atribuiti-le cate o valoare.
        Declarati o variabila in care sa stocati suma lor.
        Daca suma lor e mai mai mare sau egala cu 10, afisati “suma este mai mare decat 10”, altfel afisati “suma este mai mica decat 10”.

           6. Pentru aceleasi doua numere, daca suma e nr. par, afisati “suma este numar par”, altfel nu afisati nimic.

         */



        System.out.println(6*10); //1
        System.out.println(10/5); //2
        int x= 10;
        //++x;
        System.out.println(x++);
        System.out.println(++x);
        x+=5; //echivalent cu x=x+5

        int y = 1; //ex 5
        x=7;
        int sum = x+y;

        if (sum>=10){
            System.out.println("suma >=10");
        }
        else {System.out.println("suma < 10");}

        System.out.println(sum);
        if (sum%2==0){
            System.out.println("suma este nr par");
        }
        else System.out.println("suma nu este nr par");







    }
}
