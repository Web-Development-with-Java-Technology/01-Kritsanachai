import java.util.Scanner;

public class CalculateNumber {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your number A : ");
        Integer x = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your number B : ");
        Integer y = sc2.nextInt();

        sc1.close();
        sc2.close();

        System.out.println("-------------------------");
        System.out.println("**** Result ****");
        System.out.println("A + B = " + (x+y) );
        System.out.println("A - B = " + (x-y) );
        System.out.println("A * B = " + (x*y) );
        System.out.println("A / B = " + (x/y) );
    }
    
}
