package javabasics.com;

public class AbstractClassConstructor {
    public static void main(String[] args) {
Bike2 b1=new Honda2();
b1.run();
b1.gear();

    }
}
abstract class Bike2{
    Bike2(){
        System.out.println("This is constructor in abstract class");
    }
    abstract void run();
    void gear(){
        System.out.println("This is non-abstract method");
    }
}

class Honda2 extends Bike2{
    void run(){
        System.out.println("This is the implementation of abstract method");
    };
}