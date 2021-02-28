package basic;

public class ArithmeticOperation {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;

        System.out.println(a + b); // 200
        System.out.println(a - b); // 0
        System.out.println(a * b); // 10000
        System.out.println(a / b); // 1
        System.out.println(a %  b); // 0

        // unary operator
        System.out.println("== Unary opertor == ");
        int c = 1;
        c++;
        System.out.println(c); // 2

        c--;
        System.out.println(c); // 1

        c += 9;
        System.out.println(c); // 10

        c -= 5;
        System.out.println(c); // 5
    }
}
