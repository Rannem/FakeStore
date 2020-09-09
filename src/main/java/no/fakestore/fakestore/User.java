package no.fakestore.fakestore;

public class User {
    private String firstName;
    private String lastName;
    private Enum<Gender> gender;
    private String eMail;
    private int phoneNumber;
    private String dayOfBirth;
    private String userName;
    private String passWord;
    private String address;
    private int zipCode;

    public User(String firstName, String lastName, Enum<Gender> gender, String eMail, int phoneNumber, String dayOfBirth, String userName, String passWord, String address, int zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.dayOfBirth = dayOfBirth;
        this.userName = userName;
        this.passWord = passWord;
        this.address = address;
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Enum<Gender> getGender() {
        return gender;
    }

    public String geteMail() {
        return eMail;
    }

    public int getPhoneNumber() {
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

    public String getAddress() {
        return address;
    }

    public int getZipCode() {
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
}
