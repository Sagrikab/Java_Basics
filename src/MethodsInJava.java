import java.util.Scanner;

public class MethodsInJava {
    public static void MethodUse(int steps,int finalValue){
        while(steps<=finalValue){
            System.out.println(steps);
            steps++;
        }
    }
    // Method overloading is method having same name but different signature
    // Program to find whether the number is prime or not for int and float values using methods
    public static boolean isPrime(int num){
        int temp;
        for(int i=2;i<=num/2;i++){
            temp=num%i;
            if(temp==0){
                return false;

            }
        }
        return true;
    }
    public static boolean isPrime(double num){
        int temp;
        for(int i=2;i<=num/2;i++){
            temp=(int)num%i;
            if(temp==0){
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        MethodUse(1,10);
        System.out.println("*****************");
        MethodUse(20,40);
        System.out.println("*****************");
        boolean primeno=isPrime(25);
        boolean primefloatno=isPrime(7.5);
        if(primeno){
            System.out.println("The passed number is prime number");
        }
        else{
            System.out.println("The number passed is not a prime number");
        }
        if(primefloatno){
            System.out.println("The passed number is prime number");
        }
        else{
            System.out.println("The number passed is not a prime number");
        }
    }
}
