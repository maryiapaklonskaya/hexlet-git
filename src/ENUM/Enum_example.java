package ENUM;

import java.util.Scanner;

import static ENUM.DaysOfTheWeek.*;

public class Enum_example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a day of the week:\n");

        String userInput = scan.nextLine();

        isHoliday(userInput);
    }

    public static void isHoliday(String userInput) {

        switch (userInput) {
            case "Monday":
                MONDAY.getWeekdayType();
                break;
            case "Tuesday":
                TUESDAY.getWeekdayType();
                break;
            case "Wednesday":
                WEDNESDAY.getWeekdayType();
                break;
            case "Thursday":
                THURSDAY.getWeekdayType();
                break;
            case "Friday":
                FRIDAY.getWeekdayType();
                break;
            case "Saturday":
                SATURDAY.getWeekdayType();
                break;
            case "Sunday":
                SUNDAY.getWeekdayType();
                break;

            default:
                System.out.println("No match of the day");
                break;
        }
    }

}

enum DaysOfTheWeek {
    MONDAY ("Monday", "Weekday"),
    TUESDAY ("Tuesday", "Weekday"),
    WEDNESDAY ("Wednesday", "Weekday"),
    THURSDAY ("Thursday", "Weekday"),
    FRIDAY("Friday", "Weekday"),
    SATURDAY ("Saturday", "Holiday"),
    SUNDAY ("Sunday", "Holiday");

    private String day;
    private String weekdayType;

    DaysOfTheWeek(String day, String weekdayType) {
        this.day = day;
        this.weekdayType = weekdayType;
    }

    public String getDay() {
        System.out.println(day);
        return day;
    }

    public String getWeekdayType () {
        System.out.println(weekdayType);
        return weekdayType;
    }


}





