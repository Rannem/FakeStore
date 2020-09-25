package no.fakestore.fakestore;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 1, max = 30, message = "Firstname must be between 1 and 30 characters")
    private String firstName;

    @Size(min = 1, max = 30, message = "Lastname must be between 1 and 30 characters")
    private String lastName;

    private Gender gender = Gender.OTHER;

    @Email(message = "Enter a valid E-Mail address")
    private String eMail;

    private String phoneNumber;

    @NotEmpty
    private String dayOfBirth;

    @Size(min = 3, max = 100, message = "The username most be 3 characters long ")
    @Column(unique = true)
    private String userName;

    @Size(min = 6, max = 250, message = "The password must have 6 characters")
    private String passWord;
    @Size(min = 6, max = 250, message = "The passwords must match")
    private String confirmPassWord;


    private String address;
    private String zipCode;

    public User() {
    }

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

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setConfirmPassWord(String confirmPassWord) {
        this.confirmPassWord = confirmPassWord;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZipCode(String zipCode) {
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
