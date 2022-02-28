package bank.accounts;

import java.util.Random;

public class Account {
    protected int id;
    protected String password;
    protected double balance;
    protected boolean loggedIn = false;
    protected int branch;
    protected int accountType;
    protected double operationFee;
    public User user;

    public Account(int id, String password, double balance, int accountType, double operationFee, User user) {
        Random Random = new Random();
        this.id = id;
        this.password = password;
        this.balance = balance;
        this.branch = Random.nextInt(0, 100);
        this.accountType = accountType;
        this.operationFee = operationFee;
        this.user = user;
    }

    public void logIn(int id, String password) {
        if (this.id == id && this.password == password) {
            this.loggedIn = true;
        } else {
            System.out.println("Login failed, id or password may be incorrect.");
        }
    }

    public void deposit(double amount) {
        this.balance += (amount - (this.operationFee * amount / 100));
    }

    public void transfer(double amount, Account account) {
        if(this.loggedIn){
            if(this.balance >= amount + (this.operationFee * amount / 100)){
                this.balance -= (amount + (this.operationFee * amount / 100));
                account.deposit(amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("You must be logged in to transfer money.");
        }
    }

    public void withdraw(double amount) {
        if(this.loggedIn){
            if (this.balance >= amount) {
                this.balance -= amount;
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("You must be logged in to withdraw.");
        }
    }

    public void printBalance() {
        if(this.loggedIn){
            System.out.println("Your balance is: " + this.balance);
        } else {
            System.out.println("You must be logged in to view your balance.");
        }
    }

    public void printAccountInfo() {
        if(this.loggedIn){
            System.out.println("Your account information is: ");
            System.out.println("ID: " + this.id);
            System.out.println("Password: " + this.password);
            System.out.println("Balance: " + this.balance);
            System.out.println("Branch: " + this.branch);
            System.out.println("Account Type: " + this.accountType);
        } else {
            System.out.println("You must be logged in to view your account information.");
        }
    }
}
