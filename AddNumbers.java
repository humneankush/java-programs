import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        int x, y, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter no x and y");

        x = in.nextInt();
        y = in.nextInt();

        sum = x + y;
        System.out.println(sum);

    }

}
