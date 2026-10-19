package Lab1;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, max = 0, min = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();

            if (i == 1) {
                max = num;
                min = num;
            } else {
                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        sc.close();
    }
}