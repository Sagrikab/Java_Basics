package javabasics.wrapperclass.com;

public class ConstructorsWrapper {
    public static void main(String[] args) {
        Integer I1=new Integer(10);
        Integer I2=new Integer("10");
        //Integer I3=new Integer("ten");-->Number Format Exception
        System.out.println(I1+" "+I2);

        Float F1=new Float(10.5f);
        Float F2=new Float(10.5);
        Float F3=new Float("10.5");
        System.out.println(F1+" "+F2+" "+F3);

        //Character-> Constructor is only character not string
        Character Ch=new Character('a');
        System.out.println(Ch);
    }
}
