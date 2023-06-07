public class MyArray {
    public static void main(String[] args) {
        //int []numerePare = {2,4,6,8,10};
        int numerePare []={2,4,6,8};
        System.out.println(numerePare[0]);
        System.out.println(numerePare[1]);
        System.out.println(numerePare[2]);
        System.out.println(numerePare[3]);

        // pentru fiecare element din array, afiseaza valoarea lui
        for (int i=0;i<numerePare.length;i++){
            System.out.println(numerePare[i]);
        }

        System.out.println("-------------------------");

        String cursanti[] = {"Sami", "Gelu", "Raul","Paul", "Crina"};
        System.out.println(cursanti[4]);
        System.out.println("Cei mai buni cursanti sunt:");



        //System.out.println();
        System.out.println("\n-------------------------");
        double doubleArray[] = {1.5,2.6,7.8,9.0};
        for (int i=1; i<doubleArray.length;i+=2) {
            System.out.println(doubleArray[i]);
        }

        char charArray[] ={'a','b','c','d'};
        int lungime = charArray.length;
        System.out.println(lungime);
        for(int i=lungime-1;i>=0;i--){
            System.out.println(charArray[i]);
        }




    }
}
