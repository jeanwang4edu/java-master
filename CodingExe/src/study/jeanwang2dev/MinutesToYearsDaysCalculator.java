package study.jeanwang2dev;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }

        long totalHours = minutes / 60;
        long days = totalHours  / 24;
        long years = days / 365;
        long remaining_day = days - years * 365;
        System.out.printf("%d min = %d y and %d d%n", minutes, years, remaining_day);
    }

}
