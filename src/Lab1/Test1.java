package Lab1;

import java.util.Scanner;

public class Test1 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=0;
        System.out.println("Enter a Number:  ");
         num=sc.nextInt();
         int sum=0;

     for(int n=1000;n>=num;n--){
         sum+=n;
     }
         float ave=0;
         ave=(sum)/(1000-num+1);

         System.out.println("The sum of the Enter :"+sum);
         System.out.println("The average of the Enter :"+ave);
         sc.close();

    }

}
