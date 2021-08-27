/*
 * Checking Class
 */
public class Checking extends AccountType {
    
    protected int transferLimit; //num of allotted monthly online transfers
    protected boolean autoTransfer; //will money be transfered each month
    protected double autoAmount; //amount transfered monthly
    
    /**
     * Default Constructor.
     */
    public Checking() {
        int minOpen = 100;
        double interest = 0.01;
        transferLimit = 10;
        autoTransfer = false;
        autoAmount = 0;
    }

}
