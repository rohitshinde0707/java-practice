package employee.details;

public class Main {
    public static void main(String[] args) {
    Employee employee1 = new Employee();

    employee1.employeeFirstName = "Deep";
    employee1.employeeLastName = "HeadCrusher";
    employee1.employeeId = 1234;
    employee1.employeeAdress = new address();
    employee1.employeeAdress.country = "India";
    employee1.employeeAdress.state = "Maharashtra";
    employee1.employeeAdress.city = "Pune";
    employee1.employeeAdress.pinCode = 411018;
    employee1.employeeDetail();
    employee1.employeeDetail();
    employee1.employeeDetail();
    }
}
