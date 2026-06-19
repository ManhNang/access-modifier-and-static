public class Test {
    public static void main(String[] args) {
        Student std = new Student();

        System.out.println("Thông tin trước thay đổi: " + std.toString());
        std.setName("Năng");
        std.setClasses("C0426");
        System.out.println("Thông tin sau thay đổi: " + std.toString());
    }
}
