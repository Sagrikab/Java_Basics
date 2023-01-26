package javabasics.wrapperclass.com;

public class ParseMethod {
    public static void main(String[] args) {
        // For the given String to find the primitive value

        //Form 1
        //Every Wrapper class except Character object find the primitive value
        //public static primitive parseXXX(String s)

        int i=Integer.parseInt("10");
        double d=Double.parseDouble("10.5");
        boolean b=Boolean.parseBoolean("true");
        System.out.println(i+" "+d+" "+b);


    }
}
