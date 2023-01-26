package javabasics.com;

public class WhileLoop_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Generally while loop we use if we don't know how many times do we want to call the loop
         */
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("*************************");

        /*
        do..while(); loop is used when we want at least one statement to be executing even if the condition
        of while loop is false
         */
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
        /*
        In while loop we can have any number of conditions with operators used
        */
        int a = 1, b = 1;
        while (a < 5 || b < 5) {
            System.out.println("a:" + a + " b:" + b);
            a++;
            b++;
        }
    }
}
