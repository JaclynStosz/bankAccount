import java.util.Scanner;

/*
 * Entry point for the program
 */

public class Home {
    
    public static final Scanner scan = new Scanner(System.in);
    
    /**
     * Main entry point for the program.
     * @param args default args
     */
    public static void main(String[] args) {
        boolean on = true;
        while (on) {
            System.out.println("What would you like to do?" + "\n" 
                                + "1. Open a new account"
                                + "2. Access an existing account"
                                + "3. Quit");

            int choice = scan.nextInt();
            
            switch (choice) {
                case 1:
                    open();
                    break;
                
                case 2:
                    access();
                    break;
                
                case 3:
                    System.out.println("Goodbye");
                    on = false;
                    break;
                
                default:
                    System.out.println("Please enter a valid input.");
                    break;
            }
        }
        scan.close();
    }
    
    /**
     * When a user selects "open account".
     */
    public static void open() {
        System.out.println("Which type of account would you like to create?" + "\n"
                            + "1. Checking" + "\n"
                            + "2. Savings" + "\n"
                            + "3. Quit");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                AccountType checking1 = new Checking();
                break;
       
            case 2:
                AccountType savings1 = new Savings();
                break;
            
            case 3:
                System.out.println("Goodbye");
                break;
            
            default:
                System.out.println("Input not recognized.");
                break;
        }
    }

    /**
     * This method is called when a user selects "access account".
     */
    public static void access() {
        System.out.println("Which account would you like to access?");
        System.out.println("1. Checking");
        System.out.println("2. Savings"); 
        System.out.println("3. Quit");
        int choice = scan.nextInt();
    }
}