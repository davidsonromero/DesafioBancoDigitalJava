package bank.accounts;

public class User {
    public String name;
    public String phoneNumber;
    public String email;
    public int idNumber;

    public User(String name, String phoneNumber, String email, int idNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.idNumber = idNumber;
    }

    public void printUserInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone number: " + this.phoneNumber);
        System.out.println("Email: " + this.email);
        System.out.println("ID number: " + this.idNumber);
    }
}
