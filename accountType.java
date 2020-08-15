public class accountType
{

    private double balance;
    private double wAmount;
    private double dAmount;

    public accountType()
    {
        balance = 0;
        wAmount = 0;
        dAmount = 0;
    }

    public accountType(double b, double w, double d)
    {
        balance = b;
        wAmount = w;
        dAmount = d;
    }

    public double withdraw(double w)
    {
        if (balance >= w)
        {
            balance = balance - w;
            System.out.println("Balance: " + balance);
        }

        else if (balance < w)
        {
            System.out.println("Insufficient Funds");
            System.out.println("Balance: " + balance);
        }

        else
        {
            System.out.println("There was an error.");
        }
        return balance;
    }

    public double deposit(double d)
    {
        balance = balance + d;
        System.out.println("Balance: " + balance);
        return balance;
    }
    
}