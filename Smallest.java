import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Your second Number : ");
        int num2 = sc.nextInt();

        int num3 = Math.min(num1,num2);
        System.out.println("Minimum number is :"+(num3));
    }
}
