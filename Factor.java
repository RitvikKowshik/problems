import java.util.Scanner;
public class Factor{
   public static void main(String args[]){
      int a, b, num1, num2, temp, hcf, lcm;
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter First Number: ");
      num1 = scanner.nextInt();
      System.out.print("Enter Second Number: ");
      num2 = scanner.nextInt();
      scanner.close();

      a = num1;
      b = num2;

      while(b!= 0){  
         temp = b;
         b = a%b;
         a = temp;
      }

      hcf = a;
      lcm = (num1*num2)/hcf;

      System.out.println("HCF of input numbers: "+hcf);
      System.out.println("LCM of input numbers: "+lcm);
   }
}
