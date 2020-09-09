package no.fakestore.fakestore;

public class User {
    private String firstName;
    private String lastName;
    private boolean isMale;
    private String eMail;
    private int phoneNumber;
    private int dayOfBirth;
    private String userName;
    private String passWord;
    private String address;
    private int zipCode;

    public User(String firstName, String lastName, boolean isMale, String eMail, int phoneNumber, int dayOfBirth, String userName, String passWord, String address, int zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isMale = isMale;
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

    public boolean isMale() {
        return isMale;
    }

    public String geteMail() {
        return eMail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getDayOfBirth() {
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
}
