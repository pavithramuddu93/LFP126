package Bridge_labz_Assignment;

public class Leap_year1 {
    public static void main(String[] args) {
        int year = 2022;
        if((year%400 == 0) || (year%4 == 0 && year%100 != 0))
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}
