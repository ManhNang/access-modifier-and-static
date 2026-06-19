public class Student {
    private String name, myClass;

    public Student() {
        name = "John";
        myClass = "C02";
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setClasses(String newClass) {
        myClass = newClass;
    }

    @Override
    public String toString() {
        return "Tên " + name + " Lớp " + myClass;
    }
}
