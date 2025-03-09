package JavaEssentials.Static;

public class StaticBasic1 {

    static  int a = 3;
    static int b;
    static void math(int x)
    {
        System.out.println("x : "+ x);
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
    }

    static
    {
        System.out.println("Static block initialized...");
        b = a * a;
    }
    public static void main(String[] args) {
        math(42);
        System.out.println(a);
    }
}
