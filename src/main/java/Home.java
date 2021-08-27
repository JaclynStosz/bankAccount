import java.util.LinkedList;
import java.util.Scanner;
//import 
/*
 * Entry point for the program
 */

public class Home {
    protected static final Scanner scan = new Scanner(System.in);
    //protected JSONObject bankData = new JSONObject();
    protected static LinkedList<User> userList = new LinkedList<>();   
    protected static User currentUser;
    /**
     * Main entry point for the program.
     * @param args default args
     */
    public static void main(String[] args) {
        
        userLogin();
        
        boolean on = true;
        while (on) {
            System.out.println("\n"
                                + "What would you like to do?, " + currentUser.getUserId() + "\n" 
                                + "1. Open a new account" + "\n"
                                + "2. Make a deposit" + "\n"
                                + "3. Make a withdrawal" + "\n"
                                + "4. Display all accounts" + "\n"
                                + "5. Quit" + "\n");

            int choice = scan.nextInt();
            
            switch (choice) {
                case 1:
                    open();
                    break;
                
                case 2:
                    deposit();
                    break;
                
                case 3:
                    //withdraw();
                    break;
                
                case 4:
                    displayAccounts();
                    break;
                    
                case 5:
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
     * Initial Login.
     */
    public static void userLogin() {
        boolean on = true;
        while (on) {
            System.out.println( "\n" + "*** WELCOME ***" + "\n"
                    + "1. New User" + "\n"
                    + "2. Returning User" + "\n"
                    + "3. Quit");
   
            int choice = scan.nextInt();
            String inputUserName;
            String inputPassword;
           switch (choice) {
           case 1:
               System.out.println("Please enter a username.");
               inputUserName = scan.next();
               System.out.println("Please enter a password.");
               inputPassword = scan.next();
               User u = new User(inputUserName, inputPassword);
               userList.add(u);
               System.out.println("Welcome, " + inputUserName);
               currentUser = u;
               on = false;
               break;  
           case 2:
               if (userList.size() < 1) {
                   System.out.println("Sorry, there are no users in the system. Please try again.");
                   break;
               }
               System.out.println("Please enter your username.");
               inputUserName = scan.next();
               System.out.println("Please enter your password.");
               inputPassword = scan.next();
               User temp = new User(inputUserName, inputPassword);
               
               if(searchUsers(temp)) {
                   on = false;
                   System.out.println("Welcome back, " + inputUserName + "!");
                   currentUser = temp;
               } else {
                   System.out.println("Existing user was not found. Please try again.");
               }
               
               break;
           case 3: 
               System.out.println("Goodbye");
               on = false;
               break;
           default:
               System.out.println("Invalid input. Please try again.");
               break;
           }
        }
    }
    
    
    /**
     * When a user selects "open account".
     */
    public static void open() {
        System.out.println("Which type of account would you like to create?" + "\n"
                            + "1. Checking" + "\n"
                            + "2. Savings" + "\n"
                            + "3. Quit");
        boolean on = true;
        while (on) {
            String name;
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter a name for the account");
                    name = scan.next();
                    Checking c1 = new Checking(name);
                    currentUser.addCheckingAcc(c1);
                    break;
           
                case 2:
                    System.out.println("Please enter a name for the account");
                    name = scan.next();
                    Savings s1 = new Savings(name);
                    currentUser.addSavingsAcc(s1);
                    break;
                
                case 3:
                    System.out.println("Goodbye");
                    on = false;
                    break;
                
                default:
                    System.out.println("Input not recognized. Please try again.");
                    break;
            }
        }
    }

    /**
     * This method is called when a user selects "access account".
     */
    public static void deposit() {
        System.out.println("Enter the amount you wish to deposit:");
        int amount = scan.nextInt();
        System.out.println("Which account would you like to deposit into?");
        //for loop
        int choice = scan.nextInt();
        //  
    }
    
    public static boolean searchUsers(User u) {
        for (int i = 0; i < userList.size(); i++) {
            String u1 = userList.get(i).getUserId();
            String u2 = u.getUserId();
            String p1 = userList.get(i).getPassword();
            String p2 = u.getPassword();
            
            if (u1.contentEquals(u2) && p1.contentEquals(p2)) {
                return true;
            }
        }
        return false;
    }
    
    public static void displayAccounts() {
        System.out.println();
    }
}