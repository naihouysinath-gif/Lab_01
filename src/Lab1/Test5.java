package Lab1;

import java.util.Scanner;

public class Test5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number for finding the prime number from your enter: ");
        n = sc.nextInt();

        for (int num = 2; num <= n; num++) {
            boolean prime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}

