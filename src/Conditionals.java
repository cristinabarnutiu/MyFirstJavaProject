public class Conditionals {
    public static void main(String[] args) {
        int ora=10;
        boolean soare = false;
        if(ora<12){
            if (soare){
                System.out.println("Buna dimineata soare!");
            }
            else
            System.out.println("Buna dimineata");
        }
        else if(ora>=12&&ora<18){
            System.out.println("Buna ziua");
        }
        else if (ora>=18&&ora<24) {
            System.out.println("Buna seara");
        }
        else System.out.println("ora incorecta");

        //switch
        int zi=1;
        switch(zi){
            case 1:
                System.out.println("Luni");
                if(zi>0){
                    System.out.println("ok");
                }
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("incorect");
        }



    }


}
