package dateandtime;

import java.time.LocalDate;

public class AddandSub {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate nextWeek = today.plusDays(7);
        LocalDate lastWeek = today.minusDays(7);

        System.out.println("Today: " + today);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Last Week: " + lastWeek);
    }
}