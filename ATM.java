
public class ATM {

    public double balance = 2000.0;

    //constructor
    public ATM() {
        System.out.println("Thank you for choosing to Bank with us");
    }

    /**
     * Check and Print balance
     */
    public void checkBalance() {
        System.out.println("Your balance is :" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Your just deposited: " + amount);
        checkBalance(); // Check new balance
    }

    public static void main(String[] args) {

        /**
         * @param a -> object
         * new ATM() -> constructor
         */
        ATM a = new ATM();
        a.checkBalance(); // call check balance
        a.deposit(3000); // deposit 3000
    }
}