package javabasics.com;

public class ThisKeyword {
    int a=10; //instance variable
    static int b=20;//static variable

    void ThisKeywordExample(){
        this.a=100;
        System.out.println(a);
        this.b=200;
        System.out.println(b);
    }
    public static void main(String[] args) {
        /*
        this is the reserved keyword in java, we can't use it as identifier, it is used
        to refer current class instance as well as static members
        can be used in various contexts
        - to refer instance variable of current class
        - to invoke or initiate current class constructor
        - can be passed as an argument in the method call
        - can be passed as an argument in the constructor
        call
        - can be used to return the current class instance
         */
    new ThisKeyword().ThisKeywordExample();

    }
}
