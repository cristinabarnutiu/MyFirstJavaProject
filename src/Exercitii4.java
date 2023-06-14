public class Exercitii4 {
    public static String returneazaInversul(String string1){
        String string2 = "";
        //int lungime = string1.length();
        for(int i=string1.length()-1;i>=0;i--){
            string2 += string1.charAt(i);
        }
        return string2;
    }

    public static int calculeazaNrVocale(String stringPrimit){
        int numarVocale = 0;
        for(int i=0; i<stringPrimit.length();i++){
            if (stringPrimit.charAt(i)=='a'||
            stringPrimit.charAt(i)=='e'||
                    stringPrimit.charAt(i)=='i'||
            stringPrimit.charAt(i)=='o'||
            stringPrimit.charAt(i)=='u'){
                numarVocale++;
            }
        }
        return numarVocale;
    }

    public static String returneazaMijlocul(String stringPrimit){
        String stringMijloc ="";
        //declaram o variabila pt a afla lungimea stringului
        int lungime = stringPrimit.length();
        //daca lungimea e nr impar, returneeaza caracterul din mijloc
        if(!(lungime%2==0)){
            stringMijloc+=stringPrimit.charAt(lungime/2);
        }
        //daca lungimea e nr par, returneaza cele doua caractere din mijloc
        else stringMijloc=stringMijloc
                +stringPrimit.charAt((lungime/2)-1)
                +stringPrimit.charAt(lungime/2);
        return stringMijloc;
    }

    public static void main(String[] args) {
        System.out.println(returneazaInversul("soare"));
        System.out.println(returneazaInversul("abcdef"));
        System.out.println(calculeazaNrVocale("soare"));
        System.out.println(returneazaMijlocul("album"));
        System.out.println(returneazaMijlocul("albina"));
    }
}
