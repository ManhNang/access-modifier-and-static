class Zombie {
    // LỖI 1: Tọa độ và Máu là của riêng từng con, nhưng lại bị gán 'static' (Dùng
    // chung cho cả loài)
    public int health;
    public int positionX;
    public int positionY;

    // LỖI 2: Dữ liệu hình ảnh 3D (1MB) giống hệt nhau ở mọi con zombie,
    // nhưng lại KHÔNG có 'static' -> Mỗi lần new Zombie() là 1MB RAM biến mất!
    private static byte[] textureData = new byte[1024 * 1024];

    public Zombie(int x, int y) {
        this.health = 100;
        this.positionX = x;
        this.positionY = y;
    }

    public void takeDamage(int damage) {
        if (health < damage) {
            health = 0;
            return;
        }

        health -= damage;
    }
}
