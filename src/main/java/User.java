import java.util.LinkedList;

/*
* The purpose of this class is to collect and store user information
*/

public class User {

    private String userId;
    private String password;
    private int accounts;
    
    private static LinkedList<Checking> checkingList = new LinkedList<>();
    private static LinkedList<Savings> savingsList = new LinkedList<>();

    /**
     * Constructor.
     * @param id user id
     * @param pass password
     */
    public User(String id, String pass) {
        userId = id;
        password = pass;
        accounts = 0;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public String getPassword() {
        return password;
    }
    
    public int getAccounts() {
        return accounts;
    }
     
    public void addCheckingAcc(Checking a) {
        accounts++;
        if (a.type.equals("checking")) {
            checkingList.add(a);
        }
        else {
            //error
        }
    }
 
    public void addSavingsAcc(Savings a) {
        accounts++;
        if (a.type.equals("savings")) {
            savingsList.add(a);
        }
        else {
            //error
        }
    }
}
