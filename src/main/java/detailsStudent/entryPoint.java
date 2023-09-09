package detailsStudent;

public class entryPoint {
    public static void main(String[] args) {
        information info = new information();
        info.name = "Rohit";
        info.rollNumber = 24;

        // Initialize the 'adr' object
        info.adr = new Address();
        info.adr.city = "Pune";
        info.adr.location = "XYZ";
        info.adr.landMark = "MAruti Mandir";
        info.adr.pinCode = 411047;

        info.printDetailsStudent();
    }
}
