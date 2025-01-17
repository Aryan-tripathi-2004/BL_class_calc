import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Your second Number : ");
        int num2 = sc.nextInt();


        int num3 = Math.max(num1,num2);
        int num4 = Math.max(num3, sc.nextInt());
        System.out.println("Maximum number is :"+(num4));
    }
}
