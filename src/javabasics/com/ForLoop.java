package javabasics.com;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        /*
        In for loop all the initialization,condition and increment/decrement operation is optional
        Infinite loop using for loop
        for(;;){
        }
         */
        int i=10;
        for(;;){
            System.out.println(i);
            if(i==2){
                break;
            }
            i--;
        }

        // Numbers are prime or not
        /*
        Numbers which are divisible by 1 or by itself
         */

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int m=0;
        m=x/2;
        if(x==1 || x==0){
            System.out.println("Not Prime");
        }
      else {
            int flag = 0;
            for (int j = 2; j <= m; j++) {
                if (x%j == 0) {
                    System.out.println("Not Prime");
                    flag = 1;
                    break;
                }

            }


            if (flag == 0)
                System.out.println("Prime");

        }
      /*
      Also for loop can have any number of initializations,conditions and increment/decrement(operations)
       */

        for(int p=1,q=1;p<=4 && q<=4;p++,q++){
            System.out.println("p="+p+" q="+q);
        }

    }
}
