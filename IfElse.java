import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int marks, passMarks = 70;
        System.out.println("enter the x ");
        Scanner in = new Scanner(System.in);
        marks = in.nextInt();

        if (marks > passMarks) {
            System.out.println("you passed the exam ");

        } else {
            System.out.println("you fail the exam ");
        }

    }

}
