package bank.accounts;

public class Menu {
    public static void main(String[] args) {
        User user = new User("John", "0712345678", "bankjohn@gmail.com", 123456789);
        Account sa = new SavingsAccount(1, "12345", 560.00, user);
        Account ca = new CheckingAccount(2, "54321", 1000.00, user);    
        sa.logIn(1, "12345");
        sa.deposit(100.00);
        sa.printBalance();
        sa.transfer(100.00, ca);
        sa.printBalance();
        ca.logIn(2, "54321");
        ca.printBalance();
        sa.withdraw(100.00);
        sa.printBalance();
        sa.printAccountInfo();
        ca.user.printUserInfo();
        sa.user.printUserInfo();
    }
}
