package javabasics.com;

public class Implicit_ExplicitTypeCasting {
    public static void main(String[] args) {
        short x=10;
        int y=x;  //Implicit Type Casting(short variable can be stored into integer variable)
        //16 bit short variable can be stored into the 32 bits integer variable

        System.out.println(y);

        int a=20;
        short b=(short)a;
        System.out.println(b);

		/*
		 Here 32 bits of integer be stored into 16 bits short so we need to explicitly
		 mention the casting in which we want to convert the data type into,like here we
		 converted the integer type to short for the variable b

		 Here we are forcefully converting the integer data type into short data type
		 */

        int p=50;
        short q=(byte)p;
        System.out.println(q);

		/*
		 Here implicit type casting we have done as byte has less space i.e 8 bits which can be
		 stored into short i.e 16 bits of space
		 */

        int i=101;
        float f=i;
        System.out.println(f);

		/*
		 Here integer can be stored into float but by float format of the value stored
		 */


        float t=10.0f;
        int g=(int)t;
        System.out.println(g);
		/*
		 Here we cannot store float type values into integer type implicitly, explicitly we can do
		 this.
		 */


        int o=10;
        if(o==10) {
            if(o>10) {
                System.out.println("Greater than 10");
            }
            else {
                System.out.println("Smaller than 10");
            }
        }

		/*
		 Here we used the nested if loop
		 */

        int c=5;

        if(c==4) {
            System.out.println("Equal to 4");
        }
        else if(c>4) {
            System.out.println("Greater than 4");
        }
        else {
            System.out.println("Smaller than 4");
        }
    }

}

