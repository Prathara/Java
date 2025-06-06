public class stringmethods {
    public static void main(String[] args) {
        String text = "Hello World";

        System.out.println("Length: " + text.length());
        System.out.println("Upper: " + text.toUpperCase());
        System.out.println("Lower: " + text.toLowerCase());
        System.out.println("First char: " + text.charAt(0));
        System.out.println("Substring (0–5): " + text.substring(0, 5));
        System.out.println("Contains 'World'? " + text.contains("World"));
    }
}

