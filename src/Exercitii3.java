public class Exercitii3 {
    public static void main(String[] args) {
        int sir1[]={1, -25, 34, -2, 67, 5};
        //Scrieti un program care sa afiseze doar vecinii numerelor din sir
        for(int i=0;i<sir1.length;i++){
            int vecinulMic = sir1[i]-1;
            int vecinulMare = sir1[i]+1;
            System.out.println("vecinii lui "+sir1[i]+" sunt: "+vecinulMic+","+vecinulMare);
        }

            String sir2[]={"Anglia", "Romania", "Albania", "Franta", "Elvetia", "China", "SUA", "Australia"};
            for (String tara: sir2){
                System.out.println(tara.charAt(0));
                if(tara.charAt(0)=='A'){
                    System.out.println(tara+" incepe cu litera A");
                }

        }


    }
   }
