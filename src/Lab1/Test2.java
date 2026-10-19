package Lab1;
import java.util.Scanner;
public class Test2 {
    static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int a=0;
     int b=0;
     int c=0;
        System.out.println("Let's Solve the Problem Together heheh!");
        System.out.print("Please Enter (a):" );
            a=sc.nextInt();
        System.out.print("Please Enter (b):" );
            b=sc.nextInt();
        System.out.print("Please Enter (c):" );
            c=sc.nextInt();
        System.out.println("Okkkk !Thank you Let Solve For the Root ;)" );
        System.out.println(".......");
        System.out.println("...................");
        System.out.println("................................");
     double delta= b*b-4*a*c;

     if(Math.sqrt(delta)>0){
         double root1;
         root1=(-b+Math.sqrt(delta))/(2*a);
         double root2;
         root2=(-b-Math.sqrt(delta))/(2*a);
         System.out.println("There are two roots:");
         System.out.println("x1:" +root1);
         System.out.println("x1:" +root2);
     }
     else if(Math.sqrt(delta)==0){
         double rootSingle;
         rootSingle=(-b)/(2*a);
         System.out.println("There is only one root: " +rootSingle);
     }
     else{
         System.out.println("I think it is no roooot because of that damn DELTA");
     }
        sc.close();
    }
}
