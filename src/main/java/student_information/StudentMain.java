package student_information;

public class StudentMain {
    public static void main(String[] args) {

        StudentDetails student1 = new StudentDetails();
        student1.studentName = "Shree Kadam";
        student1.studentAge = 21;
        student1.studentDepartment = "Fashion Designer";
        student1.studentClass = "SY(Fashion Designer)";
        student1.studentLocation = "Kothrud,pune\n411041\nNear Karishma Society";

        student1.studentHeight = new Physical();
        student1.studentHeight.studentHeight = "170cm";
        student1.studentHeight.studentWeight = "51kg";

        student1.showStudentInformation();
    }
}
