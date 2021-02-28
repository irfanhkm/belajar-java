package util;

public class MathUtil {
    public static int sum(int ...number) {
        int total = 0;
        for (var value: number) {
            total += value;
        }
        return total;
    }
}
