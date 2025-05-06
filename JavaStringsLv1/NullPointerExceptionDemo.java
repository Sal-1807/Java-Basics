public class NullPointerExceptionDemo {

    public static void main(String[] args) {
        generateNullPointer();
        handleNullPointer();
    }

    public static void generateNullPointer() {
        String text = null;
        text.length();
    }

    public static void handleNullPointer() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }
}