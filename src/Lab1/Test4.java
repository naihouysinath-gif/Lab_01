
package Lab1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date(yyyy-mm-dd): ");
        String date = sc.next();

        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int maxDays = 31;

        if (month < 1 || month > 12) {
            System.out.println("Output: invalid");
        } else {

            if (month == 4 || month == 6 ||
                    month == 9 || month == 11) {
                maxDays = 30;
            }

            else if (month == 2) {

                if (year % 400 == 0) {
                    maxDays = 29;
                }
                else if (year % 100 == 0) {
                    maxDays = 28;
                }
                else if (year % 4 == 0) {
                    maxDays = 29;
                }
                else {
                    maxDays = 28;
                }
            }

            if (day >= 1 && day <= maxDays) {
                System.out.println("Output: valid");
            }
            else {
                System.out.println("Output: invalid");
            }
        }

        sc.close();
    }
}
