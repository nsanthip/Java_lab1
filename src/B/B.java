package B;

public class B {
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private char c;
    private String str;
    private boolean b;

    public static void main(String[] args) {
        B df;
        df = new B();
        df.s = 5;
        df.str = "softeng";
        df.b = true;
        System.out.println ("short s =" + df.s);
        System.out.println ("int i =" + df.i);
        System.out.println ("long l =" + df.l );
        System.out.println ("float f =" + df.f);
        System.out.println ("double d =" + df.d);
        System.out.println ("char c =" + df.c);
        System.out.println ("String s=" + df.str);
        System.out.println ("boolean b =" + df.b);
    }
}
