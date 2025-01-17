import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Your second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Your Third Number : ");
        int num3 = sc.nextInt();

        System.out.println("Sum of your number is :"+(num1+num2+num3));
    }
}
