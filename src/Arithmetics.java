import java.util.Scanner;

public class Arithmetics {

    static int add(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mul(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Введите 2 числа:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int q = add(a , b);
        int w = sub(a , b);
        int e = mul(a , b);
        int r = div(a , b);
        System.out.println("a+b=" + q);
        System.out.println("a-b=" + w);
        System.out.println("a*b=" + e);
        System.out.println("a/b=" + r);
    }
}
