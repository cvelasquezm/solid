package solid.singleresposability;

public class Main {

    public static void main(String[] args) {
        final int result = sum(1, 4);
        System.out.println(result);
    }

    /**
     * This method just have the responsibility to sum a couple a numbers, I shouldn't add more functionalities, because I'll be adding other responsibility
     * Example: This method shouldn't subtract nor multiply
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a, int b) {
        return a + b;
    }
}
