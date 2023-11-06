package composite.atm;

public class BankAccount {

    private String accountNumber;
    private String accountName;
    private double money;

    private boolean isLoggedIn;

    public BankAccount(String accountNumber,String accountName,double money) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.money = money;
        isLoggedIn = false;
    }

    public void deposit(double amount) {
        if(amount < 0 || !isLoggedIn) return;

        money += amount;
    }

    public void withdraw(double amount) {
        if(amount < 0 || !isLoggedIn) return;

        money -= amount;
    }

    public void transfer(String accountNumber,double amount) {
        if(amount < 0 || !isLoggedIn) return;

        money -= amount;
    }

    public String getBalance() {
        if(!isLoggedIn) return "You are not logged in.";
        return "You have " + money + " Baht in your account.";
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
}
