package TT.TTB2;

public class students {
    private int studentId;
    private String studentName;
    private boolean sex;
    private String className;
    private int age;
    private String address;

    public students() {

    }

    public students(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public String display() {
        return "ID: " + studentId + "\nName: " + studentName + "\nGiới tính: " + sex + "\nLớp: " + className + "\nTuổi: " + age + "\nĐịa chỉ: " + address;
    }
}
