import java.util.Scanner;
public class Ohgod{
    public static void main(String args[]){
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Palindrome");
        System.out.println("2.Armstrong");
        System.out.println("3.Automorphic");
        System.out.println("Enter the choice:");
        ch=sc.nextInt();
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        switch(ch)
        {
            case 1:
                {
                    int sum=0,r;
                    int temp=n;
                    while (n!=0)
                    {
                        r=n%10;
                        sum=(sum*10)+r;
                        n=n/10;
                    }
                    if (temp==sum)
                        System.out.println("Input is a palindrome");
                    else
                        System.out.println("Input is not a palindrome");    
                }
            break;
            
            case 2:
            int temp, flag=0,last=0,sum=0;
                temp=n;
                while(temp>0)
                {
                    temp=temp/10;
                    flag++;
                }
                temp=n;
                while(temp>0)
                {
                    last=temp%10;
                    sum+=(Math.pow(last,flag));
                    temp=temp/10;
                }
                if(n==sum)
                System.out.println ("Input is an armstrong number");
                else
                System.out.println ("Input is not an armstrong number");
            break;
            
            case 3:
                int sq=n*n;   
                while (n>0)   
                 {   
                    if (n%10 !=sq%10)   
                    System.out.println("Input isn't an automorphic number");   
                    n=n/10;   
                    sq=sq/10;   
                 }   
                System.out.println("Input is an automorphic number");   
                break;
                default:
            {
                System.out.println("Nope,invalid choice");
            }
        }
    }
}
