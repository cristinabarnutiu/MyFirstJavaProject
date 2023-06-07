public class Operatori {
    public static void main(String[] args) {
        int sum = 1;
        sum++;
        System.out.println(++sum);
        sum--;
        System.out.println(sum);
        //System.out.println(sum);

        sum+=2;//sum = sum+2;
        System.out.println(sum);

        int sum1 = 100+100; //adunare
        int sum2 = sum1+100;
        int sum3 = sum1+sum2;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum1-sum3);
        System.out.println(sum1*sum2);
        System.out.println(sum2/sum1);

        System.out.println(8%2);
        int a = 10;
        int b = 20;
        int c = 20;

        if(b%a==0){
            System.out.println("se impart exact");
        }

        if (a>b){
            System.out.println("b este mai mare");
        }

        if(b==c){
            System.out.println("b si c sunt egale");
        }

        if (c!=a){
            System.out.println("c este diferit de a");
        }

        if (b==c||a>b){
            System.out.println("b=c si b>a");
        }

        if (b==c&&(a>b||b>a)){
            System.out.println("ok");
        }

        if(!(a>b)){
            System.out.println("a>b");
        }
        boolean ceva = false;
        System.out.println(!ceva);

        if(!ceva){
            System.out.println("ramura if");
        }
        else {
            System.out.println("ramura else");
        }



    }
}
