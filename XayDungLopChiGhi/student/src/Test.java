public class Test {
    public static void main(String[] args) {
        Student std = new Student();

        System.out.println("Thông tin trước thay đổi: " + std.toString());\
        //TRUY CẬP PHƯƠNG THỨC SetName (private) => Lỗi Biên dịch!
        std.setName("Năng");
        //TRUY CẬP PHƯƠNG THỨC setClasses (private) => Lỗi Biên dịch!
        std.setClasses("C0426");
        System.out.println("Thông tin sau thay đổi: " + std.toString());
    }
}
