import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number, reverse = 0;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        while (number != 0) {
            reverse = reverse * 10; //
            reverse = reverse + number % 10; //
            number = number / 10;
        }
        System.out.println(reverse);

    }
}
