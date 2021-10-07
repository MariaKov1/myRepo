package JavaBasic.Students;

public class Main2 {

    public static void main(String[] args) {
        Student student = new Student("Orlov O.P.", "26.03.95", 725936594, 15 );

        System.out.println(student.getFIO() + " " + student.getDateOfBirth() + " " + student.getPhone() + " " + student.getNumberOfGroup());

    }
}
