class BankAccount{
    String accountHolderName;
    double accountBalance;

    BankAccount(String name, double balance){
        accountHolderName = name;
        accountBalance = balance;
    }

    void deposit(double amount){
        accountBalance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount){
        if(amount <= accountBalance){
            accountBalance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
    void displayAccountInfo(){
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("velavan", 1000.0);
        account.displayAccountInfo();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayAccountInfo();
    }
}