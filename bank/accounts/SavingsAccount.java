package bank.accounts;

public class SavingsAccount extends Account{
    public SavingsAccount(int id, String password, double balance, User user) {
        super(id, password, balance, 2, 2.5, user);
    }
}
