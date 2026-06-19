class BankAccountSystem {
    String ownerName;
    double balance;
    static double interestRate = 0.65;
    static int totalAccounts = 0;

    public BankAccountSystem(String ownerName) {
        this.ownerName = ownerName;
        balance = 0;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }
}
