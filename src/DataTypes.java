public class DataTypes {
    public static void main (String[] args) {
        boolean myBoolean = true;
        boolean myOtherBoolean = true;
        System.out.println(myBoolean&myOtherBoolean);
        System.out.println(myOtherBoolean);

        char myChar = 'A';
        char myOtherChar = '1';
        System.out.println(myChar);
        System.out.println(myOtherChar);

        //byte – un numar întreg între -128 si 127
        byte myByte = 0;
        //        short – un numar întreg între -32,768 si 32,767
        short myShort = 30000;
        //int – (integer) numar întreg
        int myInt = 340088906;
        // long – numar întreg; contine sufixul “L”, ex. 100000000000000000L
        long myLong = 456789L;

        // float – (floating point) numar cu zecimale; contine sufixul “f”, ex. 5.5f
        float myFloat = 56.56f;
        // double – numar cu zecimale (>7 zecimale)
        double myDouble =15.5;

        int number1 = 1;
        double number2 =2.5;
        double number3 = 450.578909;
        number2=number1; //casting de la int la double

        //casting de la double la int
        number1 = (int)number3;
        System.out.println(number1);


        //casting de la int la double - automat
        int intA = 4;
        double doubleA = intA;

        //casting de la double la int - trebuie specificat noul tip de date intre paranteze
        double doubleB = 5.5;
        int intB = (int) doubleB;

//        byte numberX ;
//                numberX = 10;
        byte numberX = 10;
        int numberY = numberX;
        System.out.println(numberY);

        float numberZ = 5.5f;
        numberY = (int) numberZ;
        System.out.println(numberY);


        int numarA = 5; // A=5, B
        int numarB = numarA; // A=5, B
        double numarC = numarA; //casting implicit
        System.out.println("B="+numarB);
        numarB = numarB+5; //A=5, B=10
        numarB = numarA; //B=A=5
        numarB = (int) numarC; //casting explicit

        System.out.println("A="+numarA);
        System.out.println("B="+numarB);










    }
}
