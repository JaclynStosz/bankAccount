/*
Parent class for account types
*/
public class accountType
{

    private double balance;
    private int minOpen;
    private double interest;

    public accountType()
    {
        balance = 0;
        minOpen = 0;
        interest = 0;
    }

    public accountType(double bal, double min, double in)
    {
        balance = bal;
        minOpen = min;
        interest = in;
    }
    
    /*
    public void setMinOpen(int min){
           
    }

    public void setInterest(double in){
           interest = in;
    }
    */
    
}
