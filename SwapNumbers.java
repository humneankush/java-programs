import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping\nx = " + x + "\ny = " + y);

    }

}

// x=3
// y = 4

// 3+4 = 7