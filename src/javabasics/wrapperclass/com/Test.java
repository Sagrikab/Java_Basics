package javabasics.wrapperclass.com;

public class Test {
    public static void main(String[] args) {
        Boolean b=new Boolean(true);
        Boolean c=new Boolean(false);
        Boolean d=new Boolean("yes");
        Boolean e=new Boolean("no");
        Boolean f=new Boolean("true");
        Boolean g=new Boolean("True");
        Boolean h=new Boolean("false");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(d.equals(e));

    }
}
