package gr.aueb.cf.ch11O_O_Programming;

/**
 * Represents the credentials of a user.
 * It includes information such as user ID, username, and password.
 */
public class UserCredentials {
    private long id;
    private String username;
    private String password;

    public UserCredentials() {
    }

    public UserCredentials(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
}

