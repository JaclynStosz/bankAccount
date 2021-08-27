/*
 * Savings Class
 */
public class Savings extends AccountType {
    /**
     * Default Constructor.
     */
    public Savings(String n) {
        type = "savings";
        name = n;
        accNumber = 0;
        balance = 0;
        minOpen = 1000;
        interest = 0.8;
    }

}