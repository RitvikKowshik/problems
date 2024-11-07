import java.util.Scanner;
public class Prime{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i, j, flag;
        System.out.printf("Enter first number:\n");
        a = sc.nextInt(); 
        System.out.printf("Enter last number:\n");
        b = sc.nextInt();
        System.out.printf("Prime numbers inbetween are:\n", a, b);
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}