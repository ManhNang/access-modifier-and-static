public class Student {
    private String name, myClass;

    public Student() {
        name = "John";
        myClass = "C02";
    }

    // TRUY CẬP PHƯƠNG THỨC setName (private) => Lỗi Biên dịch!
    private void setName(String newName) {
        name = newName;
    }

    // TRUY CẬP PHƯƠNG THỨC setClasses (private) => Lỗi Biên dịch!
    private void setClasses(String newClass) {
        myClass = newClass;
    }

    @Override
    public String toString() {
        return "Tên " + name + " Lớp " + myClass;
    }
}
