package javabasics.com;

public class StaticExample {
    int a=0; //will get memory each time when the instance is created
    // if you apply static keyword with the method it is static method
    static int b=0; //will get the memory only once and retain its value
    StaticExample(){
        b++;
        a++;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    public static void main(String[] args) {
        StaticExample se1=new StaticExample();
        StaticExample se2=new StaticExample();
        StaticExample se3=new StaticExample();

        System.out.println("*************************");
    }
}
