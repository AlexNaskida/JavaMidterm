package t2;

import t2.sub.potato.A21;
import t2.sub.peeler.ensemble.A22;

/**
 * R21 calculates the area of a rectangle using A21,
 * and retrieves the name of a month from A22.
 * It ensures valid month values and avoids hardcoding.
 */
public class R21 {
    public static void main(String[] args) {
        A21 rectangle = new A21();
        A22 month = new A22();

        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area: " + area);

        // Print month name
        printMonthName(month.getMonth());
    }

    private static void printMonthName(int monthNumber) {
        // Check if month is valid
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number");
            return;
        }

        // Array of month names
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        // Print the month name (subtract 1 to convert to 0-based index)
        System.out.println("Month: " + monthNames[monthNumber - 1]);
    }
}