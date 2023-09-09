package detailsStudent;

public class information {
    String name;
    int rollNumber;
    Address adr;

    void printDetailsStudent(){
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(adr.city);
        System.out.println(adr.location);
        System.out.println(adr.landMark);
        System.out.println(adr.pinCode);
    }
}
