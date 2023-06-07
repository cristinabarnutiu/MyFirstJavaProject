public class Loops {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }

        int numbers[] ={1,9,0,57,2,34};
        int max=numbers[0];
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("max="+max);

        String []students={"Andrei","Brandusa","Ionut"};
        for (int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

        try
        {
            System.out.println(students[3]);
        }
        catch(Exception e){
            System.out.println("Am intalnit o eroare"+e);
        }

        System.out.println("------");

        for (String s:students){
            System.out.println(s);
        }

        //while
        int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
            if(i==4){
                break;
            }
        }


        int z = 0;
        while(z<10){
            z++;
            if (z==4) continue;
            System.out.println(z);
            if (z==8) break;


        }



    }
}
