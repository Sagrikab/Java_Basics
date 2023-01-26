package javabasics.com;

public class AbstractClass {

    public static void main(String[] args) {
    Bike b=new Vehicle();
    b.run();
    }
}
abstract class Bike{
    abstract void run();
}
class Vehicle extends Bike{
   void run(){
       System.out.println("Implementation of the abstract class");
   }
}