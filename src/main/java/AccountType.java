/*
* Parent class for handling common account functions
*/

public class AccountType {
    protected String type;
    protected String name;
    protected int accNumber;
    protected double balance;
    protected int minOpen;
    protected double interest;
    
    public void setName(String n) {
        name = n;   
    }
    
    public void deposit(double dep) {
        balance = balance + dep;
    }
    
    /**
     * Handles withdrawal of funds.
     * @param wit amount to withdraw
     */
    public void withdraw(double wit) {
        if (wit < balance) {
            balance = balance - wit;   
        } else {
            //send insufficient funds error   
        }
    }
    
    public void compoundInterest() {
        double temp = balance * interest;
        balance = balance + temp;
    }
    
}
