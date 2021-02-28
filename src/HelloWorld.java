import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("output 1 dengan baris baru \n"); // membuat baris baru sesudahnya
        System.out.print("output 2");
        System.out.println("output 3");

        System.out.println("Type something and submit..");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println("Output from your input = " + input);
        scan.close();
    }
}
