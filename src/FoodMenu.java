import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {

        System.out.println("------Menu-------");
        System.out.println("1 : Spaghetti");
        System.out.println("2 : Green curry");
        System.out.println("3 : Hamberger");
        System.out.println("4 : Pizza");
        System.out.println("5 : Sushi");
        System.out.println("-----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number for select menu : ");
        Integer number = sc.nextInt();
        sc.close();
        switch (number) {
            case 1:
                System.out.println("Your select : Spaghetti");
                break;
            case 2:
                System.out.println("Your select : Green curry");
                break;
            case 3:
                System.out.println("Your select : Hamberger");
                break;
            case 4:
                System.out.println("Your select : Pizza");
                break;
            case 5:
                System.out.println("Your select : Sushi");
                break;
            default:
                break;
        }
    }
    
}
