public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial(1));
    }

    /**
     * @param number
     * @return Integer
     */
    public static int factorial(Integer number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
