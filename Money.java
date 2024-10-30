import java.util.Scanner;
public class Money {
    public static void main(String[]args)
    {
        double inr,usd;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter INR to convert into USD:");
        inr=n.nextInt();
        usd=inr/83.33;
        System.out.println("Rupees="+inr+"is US Dollar="+usd);
    }
}
