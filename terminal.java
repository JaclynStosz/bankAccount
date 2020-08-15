
import java.util.Scanner;
public class terminal
{
    public static void main(String[] args)
    {
        boolean on = true;

        while(on = true)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("What would you like to do?");
            System.out.println("1. Open a new account");
            System.out.println("2. Access an existing account");
            System.out.println("3. Quit");

            int choice0 = scan.nextInt();
            int choice1;

            if(choice0 == 1)
            {
                open();
            }

            else if(choice0 == 2)
            {
                acess();
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
        
    }

    public static open()
    {
        System.out.println("Which type of account would you like to create?");
        System.out.println("1. Checking");
        System.out.println("2. Savings");
        System.out.println("3. Quit");
        choice1 = scan.nextInt();

        if(choice1 == 1)
        {
            accountType checking1 = new checking();
        }

        else if(choice1 == 2)
        {
            accountType savings1 = new savings();
        }

    }

    public static acess()
    {
                System.out.println("Which account would you like to access?");
                System.out.println("1. Checking");
                System.out.println("2. Savings");
                System.out.println("3. Quit");
                choice1 = scan.nextInt();
    }

}