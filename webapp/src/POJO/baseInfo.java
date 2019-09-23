package POJO;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLFault;

public class baseInfo {
    private String email;
    private String lastName;
    private String firstName;

    public baseInfo(Register register) {
        email=register.getEmail();
        lastName=register.getLastName();
        firstName=register.getFirstName();
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



    @Override
    public String toString() {
        return "baseInfo{" +
                "email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
