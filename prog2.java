import java.util.Scanner;
public class Tables {
    public static void main(String[]args){
        int num,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        num=sc.nextInt();
        System.out.println("In normal order:");
        for(i=1;i<=10;i++){
            System.out.println(num*i);
        }
        System.out.println("In backward order:");
        for(i=10;i>=1;i--){
            System.out.println(num*i);
        }
}
}
