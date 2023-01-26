package javabasics.wrapperclass.com;

public class PrimitiveValueMethod {
    public static void main(String[] args) {

        // To find the primitive value for the given wrapper object
        //Note: 6*6+1+1=38 methods(bsilfd,c,b)
        Integer I=new Integer(130);
        System.out.println(I.byteValue());
        System.out.println(I.floatValue());

        Double D= new Double(130.5);
        System.out.println(D.floatValue());
        //charValue()
        Character Ch=new Character('a');
        char c=Ch.charValue();
        System.out.println(c);

        //booleanValue()
        Boolean B=new Boolean(true);
        boolean b=B.booleanValue();
        System.out.println(b);
    }
}
