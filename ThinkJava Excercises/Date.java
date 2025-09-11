public class Date {
    public static void main(String[] args) {
        String day = "Thursday";
        int date = 11;
        String month = "September";
        int year = 2025;

        String usaFormattedDate = String.format("American format: %s, %s %d, %d", day, month, date, year);

        String euroFormattedDate = String.format("European format: %s %d %s %d", day, date, month, year);

        System.out.println(usaFormattedDate);
        System.out.println(euroFormattedDate);

    }
}