public class VendingMachine {
        import java.util.Scanner;

        Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Welcome to Aiden and Caden's Vending Machine!");
        //Lists items (you can add more if you want)
        System.out.println("List of items: \n 1. Lays Chips - $2.00 \n 2. Cheetos - $2.00 \n 3. Cliff Bars - $1.00 \n 4. PopTarts - $2:50 \n 5. Planters Trail Mix - $3.50");
        char endLoop = 'y';
        while(endLoop == 'Y' || endLoop == 'y'){
            System.out.println(x:"What item do you want to add?");
            int snackChoice = scan.nextInt();
            Snack newSnack = new Snack(snackChoice);
            System.out.println("Do you want to add another item?");
            endLoop = scan.next().charAt(0);
        }
        System.out.println("Please Insert Exact Dollar Amount:");
        Scanner scanner = new Scanner(System.in);
        float dollarAmount = scanner.nextFloat();

        System.out.println("Balance: "+ dollarAmount);
    }
}
