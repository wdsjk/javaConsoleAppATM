package ATM;

public class ATM {
    private int pin;
    private int atmNumber;
    private double balance;

    public ATM(int pin, int atmNumber) {
        this.pin = pin;
        this.atmNumber = atmNumber;
        balance = 0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPin(int pin) {
         this.pin = pin;
    }

    public void setAtmNumber(int atmNumber) {
        this.atmNumber = atmNumber;
    }

    public double getBalance() {
        return balance;
    }

    private int getPin() {
        return pin;
    }

    private int getAtmNumber() {
        return atmNumber;
    }

    public boolean isPinCorrect(int pin) {
        if (pin == getPin())
            return true;
        return false;
    }
    public boolean isAtmNumberCorrect(int atmNumber) {
        if (atmNumber == getAtmNumber())
            return true;
        return false;
    }
}
