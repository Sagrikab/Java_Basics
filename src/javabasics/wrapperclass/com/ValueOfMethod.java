package javabasics.wrapperclass.com;

public class ValueOfMethod {
    public static void main(String[] args) {

        // We can use valueOf() methods to create wrapper class object for the given primitive & Strings
        //(An alternative to constructors

        //Form 1
        /*
        All Wrapper classes except Character class contains a static valueOf() method to create wrapper object
        for the given string/primitive types
         */

       // Integer I=Integer.valueOf('10'); //error
        Integer I2=Integer.valueOf("10");
        System.out.println(I2);

        //Form 2
        /*
        Only for the Integral type Wrapper classes(Byte,Short,Integer,Long)
        public static wrapper valueOf(String s,int radix)
        binary string-->wrapper object
         */

        Integer I3=Integer.valueOf("1111",2);
        System.out.println(I3);
System.out.println(I3.getClass().getSimpleName());

        //Form 3
        /*
        All wrapper classes including Character classes contains the valueOfMethod
        public static wrapper valueOf(primitive p)
         */

        Double D=Double.valueOf(10.5);
        Character C=Character.valueOf('a');
        System.out.println(D+" "+C);

    }
}
