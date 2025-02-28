import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Date {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    public static int getMonthFromInput(String input) {
        Map<String, Integer> monthMap = new HashMap<>();
        monthMap.put("1", 1);
        monthMap.put("2", 2);
        monthMap.put("3", 3);
        monthMap.put("4", 4);
        monthMap.put("5", 5);
        monthMap.put("6", 6);
        monthMap.put("7", 7);
        monthMap.put("8", 8);
        monthMap.put("9", 9);
        monthMap.put("10", 10);
        monthMap.put("11", 11);
        monthMap.put("12", 12);
        
        monthMap.put("January", 1);
        monthMap.put("February", 2);
        monthMap.put("March", 3);
        monthMap.put("April", 4);
        monthMap.put("May", 5);
        monthMap.put("June", 6);
        monthMap.put("July", 7);
        monthMap.put("August", 8);
        monthMap.put("September", 9);
        monthMap.put("October", 10);
        monthMap.put("November", 11);
        monthMap.put("December", 12);

        monthMap.put("Jan", 1);
        monthMap.put("Jan.", 1);
        monthMap.put("Feb", 2);
        monthMap.put("Feb.", 2);
        monthMap.put("Mar", 3);
        monthMap.put("Mar.", 3);
        monthMap.put("Apr", 4);
        monthMap.put("Apr.", 4);
        monthMap.put("May", 5);
        monthMap.put("Jun", 6);
        monthMap.put("Jun.", 6);
        monthMap.put("Jul", 7);
        monthMap.put("Jul.", 7);
        monthMap.put("Aug", 8);
        monthMap.put("Aug.", 8);
        monthMap.put("Sep", 9);
        monthMap.put("Sep.", 9);
        monthMap.put("Oct", 10);
        monthMap.put("Oct.", 10);
        monthMap.put("Nov", 11);
        monthMap.put("Nov.", 11);
        monthMap.put("Dec", 12);
        monthMap.put("Dec.", 12);

        return monthMap.getOrDefault(input, -1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = -1, year = 0;

        while (true) {
            System.out.print("Enter the month: ");
            String monthInput = scanner.next();
            
            month = getMonthFromInput(monthInput);

            System.out.print("Enter the year: ");
            year = scanner.nextInt();

            if (month == -1 || year <= 0) {
                System.out.println("Invalid month or year. Please try again.");
            } else {
                break; 
            }
        }

        int days = getDaysInMonth(month, year);
        System.out.println("20225837 - Number of days in " + month + "/" + year + " is: " + days);
        scanner.close();
    }
}