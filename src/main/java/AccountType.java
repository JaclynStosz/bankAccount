/*
Parent class for handling common account functions
*/

public class AccountType
{
    private String name;
    private double balance;
    private int minOpen;
    private double interest;

    public AccountType()
    {
        name = "";
        balance = 0;
        minOpen = 0;
        interest = 0;
    }
    
    public void setName(String n){
        name = n;   
    }
    
    public void setMinOpen(int min){
          minOpen = min; 
    }

    public void setInterest(double in){
           interest = in;
    }
    
    public void deposit(double dep){
        balance = balance + dep;
    }
    
    public void withdraw(double wit){
        if (wit < balance)
        {
            balance = balance - wit;   
        }
        else
        {
            //send insufficient funds error   
        }
    }
    
    public void addInterest(){
        double temp = balance*interest;
        balance = balance + temp;
    }
    
}
