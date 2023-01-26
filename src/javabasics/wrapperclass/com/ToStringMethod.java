package javabasics.wrapperclass.com;

public class ToStringMethod {
    public static void main(String[] args) {
        //It is used to find the string for the primitive value of wrapper object

        // Form 1

        Integer i=new Integer(100);
        String s=i.toString();
        System.out.println(s);

        System.out.println(s.getClass().getSimpleName()); //to find the class or type of the variable
        System.out.println(i.getClass().getSimpleName());

        // Form 2
        //public static String toString(primitive value)

        String s2=Integer.toString(10);
        String s3=Character.toString('a');
        String s4=Boolean.toString(true);

        System.out.println(s2+" "+s3+" "+s4);

        //Form 3
        //Only used for Integer and Long Wrapper Classes
        //public static String toString(primitive value,int radix)

        String s5=Integer.toString(15,2);
        System.out.println(s5);
        String s6=Long.toString(15,2);
        System.out.println(s6);

        //Form 4
        //Used for Integer and Long Wrapper Classes

        String s7=Integer.toBinaryString(15);
        String s8=Integer.toHexString(15);
        System.out.println("Binary: "+s7+" "+"Hex: "+s8);


    }
}
