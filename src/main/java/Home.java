
import java.util.Scanner;
public class Home
{
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        boolean on = true;

        while(on = true)
        {
            System.out.println("What would you like to do?");
            System.out.println("1. Open a new account");
            System.out.println("2. Access an existing account");
            System.out.println("3. Quit");

            int choice = scan.nextInt();

            if(choice == 1)
            {
                open();
            }

            else if(choice == 2)
            {
                access();
            }

            else if(choice == 3)
            {
                System.out.println(" ");
            }

            else
            {
                System.out.println("Please enter a valid input.");
            }
        }
        
        scan.close();
    }

    public static void open()
    {
        System.out.println("Which type of account would you like to create?");
        System.out.println("1. Checking");
        System.out.println("2. Savings");
        System.out.println("3. Quit");
        int choice = scan.nextInt();

        if(choice == 1)
        {
            AccountType checking1 = new Checking();
        }

        else if(choice == 2)
        {
            AccountType savings1 = new Savings();
        }

    }

    public static void access()
    {
        System.out.println("Which account would you like to access?");
        System.out.println("1. Checking");
        System.out.println("2. Savings"); 
        System.out.println("3. Quit");
        int choice = scan.nextInt();
    }
}