package javabasics.com;

public class SwitchConditionalStatement {
    public static void main(String[] args) {
        int a = 1;
        /*
        break statement is mandatory, except for the default case but recommended
        switch case does not allow float data type, the permissible data types are int,char,string and enum
        variables
        Sequence of the cases doesn't matter, cases are case-sensitive
         */
        switch (a) {
            case 1:
                System.out.println("The value of a is 1");
                break;
            case 2:
                System.out.println("The value of a is 2");
                break;
            case 3:
                System.out.println("The value of a is 3");
                break;
            default:
                System.out.println("The value of a is other than 1,2,3");
                break;

        }

        char b='a';

        switch (b) {
            case 'a':
            case 'A':
                System.out.println("The value of b is a");
        }




    }
}
