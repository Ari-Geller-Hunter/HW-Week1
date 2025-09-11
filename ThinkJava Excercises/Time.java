public class Time {
    public static void main(String[] args) {
        int hour = 15;
        int minute = 25;
        int second = 30;

        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;

        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

        int secondsLeftInDay = (24 - hour) * 3600 + (60 - minute) * 60 + (60 - second);

        System.out.println("Seconds left in day: " + secondsLeftInDay);

        double percentOfDayPassed = (double) secondsSinceMidnight / ((double) secondsSinceMidnight + (double) secondsLeftInDay);

        System.out.println("Percent of day passed: " + percentOfDayPassed * 100.0 + "%");

        hour = 15;
        minute = 30;
        second = 30;

        int secondsSinceMightnight2 = hour * 3600 + minute * 60 + second;

        System.out.println("Seconds spent working on this exercise: " + (secondsSinceMightnight2 - secondsSinceMidnight));
        
    }
}