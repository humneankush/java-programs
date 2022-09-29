import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int x;

        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if (x % 2 == 0) {
            System.out.println("even no");
        } else {
            System.out.println("odd");

        }
    }

}
