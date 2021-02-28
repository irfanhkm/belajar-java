public class OverloadingMethod {
    public static void main(String[] args) {
        sayNo();
        sayNo("drugs");
        sayNo("drugs", "and alcohol");

    }

    protected static void sayNo() {
        System.out.println("Method.sayNo");
    }

    /**
     * @param thing
     */
    protected static void sayNo(String thing) {
        System.out.println("Method.sayNo to " + thing);
    }

    /**
     * @param thing
     * @param text
     */
    protected static void sayNo(String thing, String text) {
        System.out.println("Method.sayNo to " + thing + " " + text);
    }

}
