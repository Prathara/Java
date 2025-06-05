public class report{
    public static void main (String[] args){
        String name = "Thara";
        int rollno = 12;
        int std = 12;

        int math = 85;
        int english = 98;
        int science = 90;

        int total = math + english + science;
        double average = total / 3.0;

        System.out.println ("Student Name : "+ name);
        System.out.println("Roll No : "+ rollno);
        System.out.println("Class : "+std);
        System.out.println("Score in math : "+math);
        System.out.println("Score in english : "+english);
        System.out.println("Score in science : "+science);
        System.out.println("Total score : "+total);
        System.out.println("Average score of three : "+average);

        


    }
}