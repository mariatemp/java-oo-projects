package gr.aueb.cf.ch13JavaDocs;

/**
 * Represents a user with unique identifier, first name and last name.
 *
 * @author maria.temp
 * @version 1.0
 * @since 09-01-2024
 */
public class User {
    private Long id;
    private String firstname;
    private String lastname;

    /**
     * Constructs a new user the specified id, first name and last name.
     *
     * @param id
     * @param firstname
     * @param lastname
     */
    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getFirstname() {return firstname;}
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
}

