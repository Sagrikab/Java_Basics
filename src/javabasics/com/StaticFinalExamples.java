package javabasics.com;

public class StaticFinalExamples {
    static int a=10;
    static int b;

    static {
        b=a*10;
    }
    static void m(){System.out.println("This is static block");}
    //static final int x; -->If static final is not initialized it will produce compile time error
    public static void main(String[] args) {

        /*
        static non-access modifier --> 1.Used for memory management
        2. Used to share same variable or method of a given class
        3. Can apply static keywords with variables, methods, blocks and nested classes
        4. static keyword belongs to the class than an instance of the class
        5. static keyword is used for a constant variable or a method that is same for every instance of a class

        Applicable for-
        1) Blocks 2) Variables 3) Methods 4) Classes

        static block is executed before main method
         */


        m(); // static block ran without creating the object
System.out.println(a+" "+b);
    }
}
