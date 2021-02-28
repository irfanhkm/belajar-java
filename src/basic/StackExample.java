package basic;

import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> iniStack = new Stack<>();
        boolean checkStack = iniStack.empty();

        System.out.println("Stack empty ? " + checkStack); //Stack empty ? true

        iniStack.push(10);
        iniStack.push(100);
        System.out.println(iniStack); // [10,100]
        iniStack.pop(); //
        System.out.println(iniStack); // [10]
        System.out.println(iniStack.peek()); // 10

        checkStack = iniStack.empty();
        System.out.println("Stack empty ? " + checkStack); //Stack empty ? false
    }
}
