import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Your second Number : ");
        int num2 = sc.nextInt();

        System.out.println("Subtract of your number is :"+(num1-num2));
    }
}
