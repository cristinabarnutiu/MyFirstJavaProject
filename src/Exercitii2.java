public class Exercitii2 {
    public static void main(String[] args) {
        for(int i=0;i<11;i++){
            System.out.println(i);
        }

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while(i<11);

        while(i<=10){
            System.out.println(i);
            i++;
        }

        //ex 2
        int j = 20;
        do {
            System.out.println(j);
            j--;
        } while(j>9);

        for (int k=20;k>=10; k--){
            System.out.println(k);
        }

        for (int k=0;k<=100;k++){
            if(k%2==0){
            System.out.println(k);}
        }

        String fructe[]={"mar","capsuni","pere","banane"};
        for (String fruct: fructe){
            System.out.println("Imi place sa mananc "+fruct);
        }
        for (int l=0;l< fructe.length;l++){
            System.out.println("Imi place sa mananc "+fructe[l]);
        }

        int luna = 2;
        switch (luna){
            case 1:
                System.out.println("Ianuarie"); break;
            case 2:
                System.out.println("Februarie");break;
        }
    }
}
