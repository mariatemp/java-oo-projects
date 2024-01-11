package gr.aueb.cf.ch14Singleton_Reflection;

/**
 * Demonstrates the use of Reflection
 */
public class Student {
    private Long id;
    private String firstname;
    private String lastname;

    public Student() { }

    public Student(Long id, String firstname, String lastname) {
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

    public void sayHello() {
        System.out.println("Hello!");
    }
}
