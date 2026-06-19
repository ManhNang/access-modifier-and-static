public class GameEngine {
    public static void main(String[] args) {
        System.out.println("--- KIỂM TRA LỖI TRẠNG THÁI ---");
        Zombie z1 = new Zombie(10, 20);
        Zombie z2 = new Zombie(50, 60);

        System.out.println("Máu z1 ban đầu: " + z1.health);
        System.out.println("Máu z2 ban đầu: " + z2.health);

        System.out.println("Người chơi bắn z1 mất 30 máu...");
        z1.takeDamage(30);

        System.out.println("Máu z1 hiện tại: " + z1.health);
        System.out.println("Máu z2 hiện tại: " + z2.health);

        System.out.println("\n--- KIỂM TRA BỘ NHỚ ---");
        Zombie[] swarm = new Zombie[10000];
        for (int i = 0; i < 10000; i++) {
            swarm[i] = new Zombie(i, i);
            if ((i + 1) % 1000 == 0) {
                System.out.println("Đã sinh ra " + (i + 1) + " zombie...");
            }
        }
    }
}
