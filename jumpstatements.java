public class jumpstatements {
    public static void main(String[] args) {
        System.out.println("Break Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                System.out.println("Breaking at i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("\nContinue Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
