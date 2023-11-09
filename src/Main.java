import java.util.Scanner;
import ATM.ATM;
import Operations.Operations;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! Welcome to the ATM. Please, enter your ATM's code number: ");
        int atmNumber = in.nextInt();
        System.out.println("and a pin code: ");
        int pinCode = in.nextInt();

        ATM atm = new ATM(pinCode, atmNumber);
        System.out.println("Congratulations! Now your ATM is ready for work!");

        System.out.println("Please type in your ATM's number: ");
        atmNumber = in.nextInt();
        while (!atm.isAtmNumberCorrect(atmNumber)) {
            System.out.println("Incorrect ATM number! Try again or leave (enter -1)");
            atmNumber = in.nextInt();
            if (atmNumber == -1) {
                in.close();
                System.exit(0);
            }
        }

        System.out.println("Please type in your ATM's pin code: ");
        pinCode = in.nextInt();
        while (!atm.isPinCorrect(pinCode)) {
            System.out.println("Incorrect ATM pin code! Try again or leave (enter -1)");
            pinCode = in.nextInt();
            if (pinCode == -1){
                in.close();
                System.exit(0);
            }
        }

        System.out.println("Okay, validation is done!");

        Operations op = new Operations();
        while (true) {
            System.out.print("1. Check balance\n2. Withdraw amount\n3. Deposit amount\n4. Exit\n");
            System.out.println("Please enter your choice: ");

            int choice = in.nextInt();
            switch (choice) {
                case 1 -> op.checkBalance(atm);
                case 2 -> {
                    System.out.println("Please enter amount to withdraw: ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(atm, withdrawAmount);
                }
                case 3 -> {
                    System.out.println("Please enter amount to deposit: ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(atm, depositAmount);
                }
                case 4 -> {
                    System.out.println("Have a good time!");
                    in.close();
                    System.exit(0);
                }
                default -> System.out.println("\nIncorrect choice! Please select between the numbers above.\n");
            }
        }
    }
}