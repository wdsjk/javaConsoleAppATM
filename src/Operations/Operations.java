package Operations;

import ATM.ATM;

public class Operations implements OperationsInterface {
    @Override
    public void checkBalance(ATM atm) {
        System.out.println("\nThe current balance is – " + atm.getBalance() + '\n');
    }

    @Override
    public void withdrawAmount(ATM atm, double amount) {
        if (amount <= atm.getBalance() && amount > 0) {
            atm.setBalance(Math.round((atm.getBalance() - amount)*100)/100.00);
            System.out.println("\nBalance has been withdrawn, the current balance is – " + atm.getBalance() + '\n');
        }
        else {
            System.out.println("\nInvalid amount! Your currently available amount of money to withdraw is – " + atm.getBalance() + '\n');
        }
    }

    @Override
    public void depositAmount(ATM atm, double amount) {
        atm.setBalance(Math.round((atm.getBalance() + amount)*100)/100.00);
        System.out.println("\nBalance has been deposited, the current balance is – " + atm.getBalance() + '\n');
    }
}
