package DSA.NumberSystem;

public class XOR {
    public static void main(String[] args) {

        int a =10,b =20;
        int x = 5, y = 3;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        x = x ^ y;

        System.out.println(a +" "+b);
        System.out.println(x +" "+y);
    }
}
