import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float tempreature;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter tempreture");
        tempreature = in.nextInt();
        tempreature = ((tempreature - 32) * 5) / 9;
        System.out.println("Temperatue in Celsius = " + tempreature);

    }

}
