package gr.aueb.cf.ch11O_O_Programming;

/**
 * Demonstrates the usage of the {@code User} and
 * {@code UserCredentials} classes
 *  by creating instances and printing their information.
 */
public class Main {

    public static void main(String[] args) {
        User userInstance = new User(1L, "John", "Boe");
        UserCredentials credentialsInstance = new UserCredentials(1L,"john.boe", "a30b4");

        System.out.println(userInstance.getId() + " " +  userInstance.getFirstname() + ", " + userInstance.getLastname());
        System.out.println(credentialsInstance.getId() + " " + credentialsInstance.getUsername() + ", " + credentialsInstance.getPassword());
    }
}
