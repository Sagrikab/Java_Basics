package javabasics.wrapperclass.com;

public class BoxingUnBoxing {
    public static void main(String[] args) {
        //AutoBoxing

       // Compiler converts int to Integer automatically

        Integer I=10;// From 1.5 java version
        //Integer=Integer.valueOf(10)

        //Auto UnBoxing

        //Compiler converts Integer to int automatically

        int i=I;
        //int i=I.intValue();

        System.out.println(I);
        System.out.println(i);

        Integer I2=new Integer(1);
        Integer I3=new Integer(1);
        System.out.println("Case 1: "+(I2==I3));

        Integer I4=10;
        Integer I5=10;
        System.out.println("Case 2: "+(I4==I5));

        Integer I6=new Integer(20);
        Integer I7=20;
        System.out.println("Case 3: "+(I6==I7));

        Integer I8=128;
        Integer I9=128;
        System.out.println(I8==I9);

    }
}





