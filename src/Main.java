import java.util.Scanner;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name , balance , and the password to create the accounts");
        //create user;
        String name=sc.next();

        double balance= sc.nextDouble();
        String password=sc.next();

        SbiUser user= new SbiUser(name, balance, password);

        // creation of account number
        System.out.println("the new account number of sbi "+user.getAccountNo());

        //add amount;
        String message=user.addMoney(100000);
        System.out.println(message);

        // withdraw money
        System.out.println("enter amount you want to withdraw");
        int money= sc.nextInt();
        System.out.println("enter the password");
        String pass=sc.next();
        System.out.println(user.WithdrawMoney(money, pass));

        // rate of interest
        System.out.println("and interest equal to"+ user.calculateInterest(10));
        System.out.println("this is the change");

    }
}

