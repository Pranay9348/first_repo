import java.util.Scanner;

public class Account {
    int acct_no;
    String acct_type;
    String customer_name;
    double acct_balance;

    public Account(int acct_no, String acct_type, String customer_name, double acct_balance) {
        this.acct_no = acct_no;
        this.acct_type = acct_type;
        this.customer_name = customer_name;
        this.acct_balance = acct_balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[5];

        // Input details of 5 customers
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Account No:");
            int acct_no = scanner.nextInt();
            System.out.println("Enter Account Type:");
            String acct_type = scanner.next();
            System.out.println("Enter Customer Name:");
            String customer_name = scanner.next();
            System.out.println("Enter Account Balance:");
            double acct_balance = scanner.nextDouble();
            accounts[i] = new Account(acct_no, acct_type, customer_name, acct_balance);
        }

        // Find the customer with the maximum account balance
        Account maxAcct = accounts[0];
        for (int i = 1; i < accounts.length; i++) {
            if (accounts[i].acct_balance > maxAcct.acct_balance) {
                maxAcct = accounts[i];
            }
        }

        // Print the details of the customer with the maximum account balance
        System.out.println("Customer with Maximum Balance:");
        System.out.println("Account No: " + maxAcct.acct_no);
        System.out.println("Account Type: " + maxAcct.acct_type);
        System.out.println("Customer Name: " + maxAcct.customer_name);
        System.out.println("Account Balance: " + maxAcct.acct_balance);
    }
}