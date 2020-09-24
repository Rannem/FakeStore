package no.fakestore.fakestore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String firstName;

    @Size(min = 1, max = 30, message = "Firstname must be between 1 and 30 characters")
    private String lastName;
    private Gender gender = Gender.OTHER;
    private String eMail;
    private String phoneNumber;
    private String dayOfBirth;
    private String userName;
    private String passWord;
    private String confirmPassWord;
    private String address;
    private String zipCode;

    public User(String firstName, String lastName, Gender gender, String eMail, String phoneNumber, String dayOfBirth, String userName, String passWord, String confirmPassWord, String address, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.dayOfBirth = dayOfBirth;
        this.userName = userName;
        this.passWord = passWord;
        this.confirmPassWord = confirmPassWord;
        this.address = address;
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getConfirmPassWord() {
        return confirmPassWord;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {


        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +

                ", eMail='" + eMail + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", dayOfBirth=" + dayOfBirth +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", address='" + address + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    public boolean isPasswordEqual() {
        if (passWord.equals(confirmPassWord)) {
            return true;
        } else {
            return false;
        }
    }
}
