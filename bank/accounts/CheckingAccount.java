package bank.accounts;

public class CheckingAccount extends Account{
    public CheckingAccount(int id, String password, double balance, User user) {
        super(id, password, balance, 1, 5.0, user);
    }
}
