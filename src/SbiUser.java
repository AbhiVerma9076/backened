import java.util.Objects;
import java.util.UUID;

public class SbiUser implements BankInterface{
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateofInterest;

    public SbiUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        // bank is initializing
        this.rateofInterest=6.5;
        this.accountNo= String.valueOf(UUID.randomUUID());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateofInterest() {
        return rateofInterest;
    }

    public void setRateofInterest(double rateofInterest) {
        this.rateofInterest = rateofInterest;
    }

    @Override
    public double CheckBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "your new balance us :"+balance;
    }

    @Override
    public String WithdrawMoney(int amount, String enterPassword) {
        if(Objects.equals(enterPassword, password))
        {
            if(amount>balance)
            {
                return " sorry bro ! insufficient balance ";
            }
            else{
                balance=balance-amount;
                return " paisa hi paisa "+"remaining balance"+balance;
            }
        }
        else {
            return "wrong password";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateofInterest)/100;
    }
}
