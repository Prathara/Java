import java.util.Scanner;
    public class simpleinterest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Principal (₹): ");
            double principal = input.nextDouble();
            System.out.print("Enter Rate (%): ");
            double rate = input.nextDouble();
            System.out.print("Enter Time (in years): ");
            double time = input.nextDouble();
            double interest = (principal * rate * time) / 100;
            System.out.println("Simple Interest = ₹" + interest);
    }
}

    