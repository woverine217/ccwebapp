package POJO;

public class User {
    private Long id;
    private String email;
    private String lastName;
    private String firstName;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String accountCreated;
    private String accountUpdate;

    public User(Register register) {
        email=register.getEmail();
        lastName=register.getLastName();
        firstName=register.getFirstName();
        password=register.getPassWord();
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAccountCreated() {
        return accountCreated;
    }

    public void setAccountCreated(String accountCreated) {
        this.accountCreated = accountCreated;
    }

    public String getAccountUpdate() {
        return accountUpdate;
    }

    public void setAccountUpdate(String accountUpdate) {
        this.accountUpdate = accountUpdate;
    }
}
