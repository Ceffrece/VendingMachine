import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //VendingMachine vendingMachine;
        //System.out.println("Hello world!");
        System.out.println("Welcome to Aiden and Caden's Vending Machine!");
        //Lists items (you can add more if you want)
        System.out.println("List of items: \n 1. Lays Chips - $2.00 \n 2. Cheetos - $2.00 \n 3. Cliff Bars - $1.00 \n 4. PopTarts - $2:50 \n 5. Planters Trail Mix - $3.50");

        System.out.println("Please Insert Exact Dollar Amount:");
        Scanner scanner = new Scanner(System.in);
        float dollarAmount = scanner.nextFloat();

        System.out.println("Balance: "+ dollarAmount);
    }
}