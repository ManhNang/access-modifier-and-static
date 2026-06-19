public class MainBank {
    public static void main(String[] args) {
        BankAccountSystem acc1 = new BankAccountSystem("Alice");
        BankAccountSystem acc2 = new BankAccountSystem("Bob");

        System.out.println("--- NẠP TIỀN VÀ IN SỐ DƯ ---");
        acc1.deposit(1000);
        System.out.println("Tài khoản Alice: " + acc1.ownerName + " | Số dư: " + acc1.balance);
        acc2.deposit(500);
        System.out.println("Tài khoản Alice sau khi Bob nạp tiền: " + acc1.balance);
        System.out.println("Tài khoản Bob: " + acc2.ownerName + " | Số dư: " + acc2.balance);

        System.out.println("\n--- THAY ĐỔI LÃI SUẤT HỆ THỐNG ---");
        System.out.println("Lãi suất Alice và Bob trước khi thay đổi: ");
        System.out.println("Lãi suất Alice: " + acc1.interestRate + " | Lãi suất Bob: " + acc2.interestRate);
        BankAccountSystem.updateInterestRate(0.07);
        System.out.println("Lãi suất Alice và Bob sau khi thay đổi: ");
        System.out.println("Lãi suất Alice: " + acc1.interestRate + " | Lãi suất Bob: " + acc2.interestRate);

        System.out.println("\n--- SỐ LƯỢNG TÀI KHOẢN ĐÃ TẠO ---");
        System.out.println("Số lượng: " + BankAccountSystem.totalAccounts);
    }
}
