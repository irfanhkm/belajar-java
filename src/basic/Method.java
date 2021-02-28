package basic;

public class Method {
    public static void main(String[] args) {
        var method = new Method();
        method.sayNo();
        method.sayYes();
        method.sayNo();
        method.sayYes();
        method.sayNo();
        method.sayYes();
        method.sayNo();
        method.sayYes();
        method.sayNo();
        method.sayYes();
    }

    public void sayNo() {
        System.out.println("Method.sayNo");
    }

    public void sayYes() {
        System.out.println("Method.sayYes");
    }
}
