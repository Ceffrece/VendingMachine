import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        List order = new ArrayList();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Aiden and Caden's Vending Machine!");
        //Lists items (you can add more if you want)
        System.out.println("List of items: \n 1. Lays Chips - $2.00 \n 2. Cheetos - $2.00 \n 3. Cliff Bars - $1.00 \n 4. PopTarts - $2:50 \n 5. Planters Trail Mix - $3.50");
        System.out.println("What item do you want to add?");
        int snackChoice = scan.nextInt();
        Snack newSnack = new Snack(snackChoice);
        order.add(snackChoice);

        System.out.println("Do you want to add another item? (Type 'y' for yes or 'n' for no");
        Scanner scanner = new Scanner(System.in);
        String yesno = scanner.nextLine();
        if (yesno == "y") {

        }


        System.out.println("Please Insert Exact Dollar Amount (Only $1 bills are accepted)");
        float dollarAmount = scanner.nextFloat();

        System.out.println("Balance: " + dollarAmount);

    }
}