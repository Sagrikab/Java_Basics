package javabasics.com;

public class AbstractBankExample {

    public static void main(String[] args) {

        Bank b=new SBI();
        System.out.println(b.draw());

        Bank b2=new HDFC();
        System.out.println(b2.draw());

        Bank b3=new Baroda();
        System.out.println(b3.draw());
    }
}
abstract class Bank{
    abstract int draw();
}
class SBI extends Bank{
    int draw(){
        return 7;
    }
}
class HDFC extends Bank{
    int draw(){
        return 8;
    }
}

class Baroda extends Bank{
    int draw(){
        return 6;
    }
}