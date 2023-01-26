package javabasics.com;

public class JavaOperators {
    public static void main(String[] args) {
        /*
        Unary Operator - Require only one operand
        Operations Performed - incrementing/decrementing a value
                             - negating an expression
                             - inverting the value of a boolean
                             ++,--,~,!
         */

        int s = 1, t = 1;
        boolean a = false;
        System.out.println(s++);
        System.out.println(++s);

        System.out.println(~t);

        System.out.println(!a);

        /*
        Arithmetic Operators - Used to perform operations, mathematical operations
                            +,-,*,/,%

         */
        int b = 10, c = 5;
        System.out.println(b % c);


        /*
        Left Shift Operator - It is used to shift all of the bits in a value to the left side of a
        specified number of times
        l<<s--> l*2^s
         */

        System.out.println(15 << 4);


      /*
        Right Shift Operator - It is used to move the value of the left operand to right by the
        number of bits specified by the right operand

        r<<s--> r/2^s
     */

    System.out.println(20>>2);

    /*
    Logical AND(&&) and Bitwise AND(&)
    Logical & does not check the second condition if the first condition is false
     */

        int e=10,f=5,g=20;
        System.out.println(e<f && e<g);

          /*
    Logical OR(||) and Bitwise OR(|)
    Logical || does not check the second condition if the second condition is true
     */


        System.out.println(e<f | e<g);

        /*
        Ternary Operator - Used as one of the replacement for if-then-else statement
        It is the only conditional operator which takes three operands

         */
       int min=(e<f)?e:f;
       System.out.println(min);

       /*
       Assignment Operator - Assign the value of its right to the operand on its left
        */

        e+=4;
        System.out.println(e);


    }

}
