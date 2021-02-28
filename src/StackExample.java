import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> iniStack = new Stack<>();
        boolean checkStack = iniStack.empty();

        iniStack.push(10);
        iniStack.push(100);
        System.out.println(iniStack); // [10,100]
        iniStack.pop(); //
        System.out.println(iniStack); // [10]
        System.out.println(iniStack.peek()); // 10
    }
}
