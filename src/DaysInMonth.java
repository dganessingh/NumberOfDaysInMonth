import java.util.Scanner;
import java.time.YearMonth;
import java.time.Month;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = scan.nextInt();

        System.out.println("Enter a month (1-12):");
        int month = scan.nextInt();

        YearMonth yearMonthObject = YearMonth.of(year, month);

        int daysInMonth = yearMonthObject.lengthOfMonth();

        System.out.println("Year: " + year + ", Month: " + Month.of(month) + " has " + daysInMonth + " days.");

        





    }
}
