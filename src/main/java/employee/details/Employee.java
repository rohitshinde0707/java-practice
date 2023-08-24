package employee.details;

public class Employee {
    public String employeeFirstName;
    String employeeLastName;
    int employeeId;
    address employeeAdress;

    void employeeDetail(){
        System.out.println("Name:"+employeeFirstName);
        System.out.println("Last Name:"+employeeLastName);
        System.out.println("Employee Id Number:"+employeeId);
        System.out.println("Address:"+employeeAdress.country);
        System.out.println("City:"+employeeAdress.city);
        System.out.println("State:"+employeeAdress.state);
        System.out.println("PinCode:"+employeeAdress.pinCode);

    }


}
