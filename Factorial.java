// import java.util.Scanner;

// public class Factorial {
//     public static void main(String[] args) {
//         int number = 0, fact = 1;
//         System.out.println("Enter no fact=");
//         Scanner in = new Scanner(System.in);
//         number = in.nextInt();
//         if (number < 0) {
//             System.out.println("number should be non negative");

//         } else {

//             for (int c = 1; c <= number; c++) {
//                 fact = fact * c;
//             }
//         }
//         System.out.println(" factorial = " + fact);

//     }

// }

import java.util.Scanner;
import java.math.BigInteger;

class BigFactorial {
    public static void main(String args[]) {
        int n, c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        n = input.nextInt();
        for (c = 1; c <= n; c++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        System.out.println(n + "! = " + fact);
    }
}