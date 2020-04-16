package Week1;

public class DigitTester {
    public static void main(String[] args) {
        Digits digits = new Digits(12354);
        System.out.println(digits.getDigits().toString());
        System.out.println("is strictly increasing: " + digits.isStrictlyIncreasing());
    }
}
