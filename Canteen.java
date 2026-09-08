import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int orderQty = 0;
        int chosenItem = 0;
        double itemPrice = 0;
        double originalCost = 0;
        double studentDiscount = 0.0;
        double amountToPay = 0.0;

        char studentStatus;

        System.out.print("Are you a student? (Y/N): ");
        studentStatus = input.next().charAt(0);

        System.out.println("==== MENU ====");
        System.out.println("1. Burger -$80.00");
        System.out.println("2. Pizza -$120.00");
        System.out.println("3. Pasta -$100.00");
        System.out.println("4. Sandwich -$70.00");
        System.out.println("5. Milktea -$90.00");

        System.out.print("Enter item number: ");
        chosenItem = input.nextInt();

        System.out.print("Enter quantity: ");
        orderQty = input.nextInt();

        switch (chosenItem) {
            case 1:
                itemPrice = 80.00;
                break;
            case 2:
                itemPrice = 120.00;
                break;
            case 3:
                itemPrice = 100.00;
                break;
            case 4:
                itemPrice = 70.00;
                break;
            case 5:
                itemPrice = 90.00;
                break;
            default:
                System.out.println("Invalid item number selected.");
                return;
        }

        originalCost = itemPrice * orderQty;

        if (studentStatus == 'Y' || studentStatus == 'y') {
            studentDiscount = originalCost * 0.10;
        }

        amountToPay = originalCost - studentDiscount;

        System.out.println("\n==== RECEIPT ====");
        System.out.printf("Total Before Discount: $%.2f\n", originalCost);
        System.out.printf("Discount Applied: -$%.2f\n", studentDiscount);
        System.out.printf("Final Total: $%.2f\n", amountToPay);
    }
}
