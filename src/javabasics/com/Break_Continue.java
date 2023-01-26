package javabasics.com;

public class Break_Continue {
    public static void main(String[] args) {
        /*
        break terminates the execution cycle but continue terminates the specific iteration
         */

        for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("*************");
        int j=1;
        while(j<=5){
            System.out.println(j);
        if(j==4){
            break;
        }
        j++;
        }

       while(true){
           System.out.println("Hello");
           break;
       }
    }


}
