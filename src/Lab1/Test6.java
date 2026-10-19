package Lab1;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Math: ");
        int math = sc.nextInt();

        System.out.print("English: ");
        int english = sc.nextInt();

        System.out.print("Physics: ");
        int physics = sc.nextInt();

        System.out.print("Programming: ");
        int programming = sc.nextInt();

        int max = math;
        String maxSubject = "Math";
        int min = math;
        String minSubject = "Math";

        if (english > max) {
            max = english;
            maxSubject = "English";
        }
        if (physics > max) {
            max = physics;
            maxSubject = "Physics";
        }
        if (programming > max) {
            max = programming;
            maxSubject = "Programming";
        }

        if (english < min) {
            min = english;
            minSubject = "English";
        }
        if (physics < min) {
            min = physics;
            minSubject = "Physics";
        }
        if (programming < min) {
            min = programming;
            minSubject = "Programming";
        }

        int sum = math + english + physics + programming;

        System.out.println("Max: " + max);
        System.out.println("Max subject: " + maxSubject);
        System.out.println("Min: " + min);
        System.out.println("Min subject: " + minSubject);
        System.out.println("Average: " + sum / 4.0);

        sc.close();
    }
}
