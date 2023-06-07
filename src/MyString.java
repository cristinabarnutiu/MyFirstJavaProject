import java.sql.SQLOutput;

public class MyString {
    public static void main (String[] args) {
        String myString = "Buna seara";
        String nume = "Cristina";
        String space= " ";
        int lungimeaNumelui = nume.length();
        String numeMare = nume.toUpperCase();
        String numeMic = nume.toLowerCase();
        char aTreiaLitera = nume.charAt(2);

        System.out.println(myString+space+nume);
        System.out.println(myString+" "+nume+"!");
        System.out.println(lungimeaNumelui);
        System.out.println(numeMare);
        System.out.println(numeMic);
        System.out.println(aTreiaLitera);

        String numeleMeu="Jon Doe";
        int numarulDeLitereDinNumeleMeu = numeleMeu.length();
        System.out.println("Exerccitiul 3:"+numarulDeLitereDinNumeleMeu);
        char primaLitera = numeleMeu.charAt(0);
        System.out.println("Prima litera din text este:"+primaLitera);
        String nume1 = "Jon";
        String prenume1 = "Doe";
        System.out.println(nume1+prenume1);
        String numePrenume = nume1.concat(prenume1);
        System.out.println(numePrenume);

        String film = "Filmul meu preferat este \n\"Avatar\".";
        String film2 = "Filmul meu preferat este \n\"Avatar\".";
        System.out.println(film);

        boolean continePreferat = film.contains("preferat");
        System.out.println(continePreferat);
        boolean texteleSePotrivesc = film2.matches(film);
        System.out.println(texteleSePotrivesc);

        boolean ultimulCaracter = film.endsWith(".");
        System.out.println(ultimulCaracter);

        String primulCuvant = film.substring(0,6);
        System.out.println(primulCuvant);





    }
}
