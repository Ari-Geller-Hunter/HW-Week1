import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number of seconds: ");

        int secondsToConvert = scanner.nextInt();

        int hours = secondsToConvert / 3600;

        int minutes = ( secondsToConvert % 3600 ) / 60;

        int seconds = secondsToConvert % 3600 % 60;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds.\n", secondsToConvert, hours, minutes, seconds);

        scanner.close();
    }
}