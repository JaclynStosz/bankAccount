/*
 * Checking Class
 */
public class Checking extends AccountType {
    /**
     * Default Constructor.
     */
    public Checking(String n) {
        type = "checking";
        name = n;
        accNumber = 0;
        balance = 0;
        minOpen = 100;
        interest = 0;
    }
}
