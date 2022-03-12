package Bridge_labz_Assignment;

public class harmonic_numbers {
        public static void main(String[] args) {
        double n=10,i;
        double sum=0;
	    for( i=1;i<=n;i++)
            {
            sum=sum+(1/i);
            }
            System.out.println("Harmonic value = "+sum);
    }
}