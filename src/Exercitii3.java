public class Exercitii3 {
    public static void main(String[] args) {
        int sir1[]={1, -25, 34, -2, 67, 5};
        //Scrieti un program care sa afiseze doar vecinii numerelor din sir
        for(int i=0;i<sir1.length;i++){
            int vecinulMic = sir1[i]-1;
            int vecinulMare = sir1[i]+1;
            System.out.println("vecinii lui "+sir1[i]+" sunt: "+vecinulMic+","+vecinulMare);
            if(sir1[i]<0){
            System.out.println(sir1[i]+" E mai mic decat 0");}
        }



            String sir2[]={"Anglia", "Romania", "Albania", "Franta", "Elvetia", "China", "SUA", "Australia"};
            for (String tara: sir2){
                System.out.println(tara.charAt(0));
                if(tara.charAt(0)=='A'){
                    System.out.println(tara+" incepe cu litera A");
                }
        }

        //ex 7
            for (String tara: sir2){
            System.out.println(tara+" are "+tara.length()+ " litere");
            }

            //ex 8 si ex 9

        int max= 0;
            int min = 99;
            String taraCuCelMaiLungNume = "";
        String taraCuCelMaiScurtNume = "";
        for (String tara: sir2){
            if (tara.length()>max){
                max = tara.length();
                taraCuCelMaiLungNume=tara;
            }
        }
        for (String tara: sir2){
            if (tara.length()<max){
                min = tara.length();
                taraCuCelMaiScurtNume=tara;
            }
        }
        System.out.println("Tara cu cel mai lung nume este: "+taraCuCelMaiLungNume);
        System.out.println("Tara cu cel mai scurt nume este: "+taraCuCelMaiScurtNume);

//        int max = 0;
//        String taraCuCelMaiLungNume = "";
//            for (String tara: sir2){
//                if (tara.length()>=max){
//                    max = tara.length();
//                    taraCuCelMaiLungNume=tara;
//                }
//            }
//        System.out.println(taraCuCelMaiLungNume);





    }
   }
