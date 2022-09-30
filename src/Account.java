import java.math.BigDecimal;

public class Account {
    private float _balance = 0.00f;

    public Account(float startingBalance) {
        _balance = startingBalance;
    }

    public float getBalance() {
        return _balance;
    }

    public float withdraw(float amount) {
        _balance = _balance - amount;
        return _balance;
    }

    public float deposit(float amount) {
        _balance = _balance + amount;
        return _balance;
    }
}
