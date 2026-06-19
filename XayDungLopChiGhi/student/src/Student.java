public class Student {
    private String name, myClass;

    public Student() {
        name = "John";
        myClass = "C02";
    }

    protected void setName(String newName) {
        name = newName;
    }

    protected void setClasses(String newClass) {
        myClass = newClass;
    }

    @Override
    public String toString() {
        return "Tên " + name + " Lớp " + myClass;
    }
}
