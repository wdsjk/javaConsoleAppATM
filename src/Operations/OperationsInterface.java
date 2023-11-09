package Operations;

import ATM.ATM;

public interface OperationsInterface {
    public void checkBalance(ATM atm);
    public void withdrawAmount(ATM atm, double amount);
    public void depositAmount(ATM atm, double amount);
}
