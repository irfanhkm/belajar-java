package basic;

public class StaticMethod {
    public static void main(String[] args) {
        sayNo();
        sayYes();
        sayNo();
        sayYes();
        sayNo();
        sayYes();
        sayNo();
        sayYes();
        sayNo();
        sayYes();
    }

    static void sayNo() {
        System.out.println("StaticMethod.sayNo");
    }

    static void sayYes() {
        System.out.println("StaticMethod.sayYes");
    }
}
