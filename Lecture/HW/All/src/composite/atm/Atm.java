package composite.atm;

public class Atm {
    private String accountId;
    private String pin;

    private BankAccount bankAccount;

    public Atm(String accountId, String pin, BankAccount bankAccount) {
        this.accountId = accountId;
        this.pin = pin;
        this.bankAccount = bankAccount;
    }

    public boolean validateId(String accountId) {
        return this.accountId.equals(accountId);
    }

    public boolean validatePin(String pin) {
        boolean isCorrect = this.pin.equals(pin);
        bankAccount.setIsLoggedIn(isCorrect);
        return isCorrect;
    }


}
