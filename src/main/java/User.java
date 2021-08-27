/*
* The purpose of this class is to collect and store user information
*/

public class User {

    public String userId;
    public String password;
    public int accounts;

    /**
     * Default Constructor.
     */
    public User() {
        userId = "";
        password = "";
        accounts = 0;
    }
    
    /**
     * Constructor.
     * @param id user id
     * @param pass password
     */
    public User(String id, String pass) {
        userId = id;
        password = pass;
    }
      
    //when new account is added, num of accounts increases
      
    public int addAccount() {
        accounts++;
        return accounts;
    }
 
}
