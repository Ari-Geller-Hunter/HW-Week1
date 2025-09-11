import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in Celcius:");

        double celcius = scanner.nextDouble();

        double farenheit = celcius * (9.0 / 5.0) + 32;

        System.out.printf("%f C = %f F", celcius, farenheit);

        scanner.close();
    }
}