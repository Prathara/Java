import java.util.Scanner;

    public class Conditions {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your marks (0–100): ");
            int marks = input.nextInt();

            if (marks >= 90) {
                System.out.println("Grade: A+");
            } else if (marks >= 80) {
                System.out.println("Grade: A");
            } else if (marks >= 70) {
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else if (marks >= 50) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F (Fail)");
            }
            System.out.print("Enter your day number (1-7): ");
            int d = input.nextInt();
                switch (d){
                    case 1 :
                    {System.out.println("Sunday");
                    break;}
                    case 2 :
                    {System.out.println("Monday");
                    break;}
                    case 3 :
                    {System.out.println("Tuesday");
                    break;} 
                    case 4 :
                    {System.out.println("Wednesday"); 
                    break;}
                    case 5 :
                    {System.out.println("Thursday"); 
                    break;}
                    case 6 :
                    {System.out.println("Friday"); 
                    break;}
                    case 7 :
                    {System.out.println("Saturday"); 
                    break;}
                    default :System.out.println("Invalid option!"); 
            

        }
     }
}
