package Bridge_labz_Assignment;

import java.util.Scanner;
public class largestThreeNumber1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number :");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number :");
        int c = sc.nextInt();

        if ( a > b && a > c ){
            System.out.println("Largest number is ::"+ a);
        }else if ( b > a && b > c ){
            System.out.println("Largest number is ::"+ b);
        }else if ( c > a && c > b ){
            System.out.println("Largest number is ::"+ c);
        }else{
            System.out.println("Cnnot validate");
        }

    }
}
