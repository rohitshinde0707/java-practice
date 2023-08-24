package student_information;

public class StudentDetails {

    String studentName;
    int studentAge;
    String studentClass;
    String studentDepartment;
    String studentLocation;

    Physical studentHeight;

    void showStudentInformation(){
        System.out.println("Name of Student is :" + studentName);
        System.out.println("Student Age :" + studentAge);
        System.out.println("Student Department:" + studentDepartment);
        System.out.println("Student Class:" + studentClass);
        System.out.println("Student Location:" + studentLocation);
        System.out.println("Physical Details");
        System.out.println("Height:"+ studentHeight.studentHeight);
        System.out.println("Weight:"+studentHeight.studentWeight);
    }

}
