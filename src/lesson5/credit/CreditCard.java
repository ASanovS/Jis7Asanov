package lesson5.credit;

import java.util.Objects;

public class CreditCard {
    private long creditCardNumber;
    private int pinCode;
    private int balance = 0;
    private int creditLimit;
    private int credit = 0;

    public CreditCard(long creditCardNumber, int pinCode) {
        this.creditCardNumber = creditCardNumber;
        this.pinCode = pinCode;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return creditCardNumber == that.creditCardNumber && pinCode == that.pinCode && balance == that.balance && creditLimit == that.creditLimit && credit == that.credit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditCardNumber, pinCode, balance, creditLimit, credit);
    }

    public void deposit(int deposit) {
        this.balance += deposit;
    }

    public void withdraw(int withCash) {
        this.balance -= withCash;
    }
}
