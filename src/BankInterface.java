public interface BankInterface {
    double CheckBalance();
    String addMoney(int amount);
    String WithdrawMoney(int amount, String Password);
    double calculateInterest(int years);


}
