package controlStatements;

public class Demo2 {

	public static void main(String[] args) {
		
		int year = 2024;
        int month = 2; // February

        int daysInMonth;

        // Checking for February and leap year
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
        }
        // Checking for months with 30 days
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        }
        // All other months have 31 days
        else {
            daysInMonth = 31;
        }

        // Displaying the result
        System.out.println("Number of days in the month: " + daysInMonth);
    }


	}


