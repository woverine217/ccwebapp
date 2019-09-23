package POJO;


public class Register {


    private String email;
    private String lastName;
    private String firstName;
    private String passWord;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



        public Register(String email, String firstName, String lastName, String passWord) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passWord = passWord;
    }
    public Register(){}

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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Register{" +

                ", email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}


//Email Address
//        Password
//        First Name
//        Last Name