public class string {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        System.out.println(a == b);       
        System.out.println(a.equals(c));  

    }
}
