package level01;
public class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private final String accountNumber;

    private String accountHolderName;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String newBankName) {
        bankName = newBankName;
    }

    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", "ACC1001");
        BankAccount account2 = new BankAccount("Bob", "ACC1002");

        if (account1 instanceof BankAccount) {
            account1.displayAccountDetails();
        }
        if (account2 instanceof BankAccount) {
            account2.displayAccountDetails();
        }

        BankAccount.getTotalAccounts();

        BankAccount.setBankName("International Bank");
        account1.displayAccountDetails();
    }
}