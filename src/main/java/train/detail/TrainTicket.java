
package train.detail;

import java.sql.Time;
import java.util.Date;

public class TrainTicket {
    int trainNumber;
    Date dateOfArrival;
    Time time;
    Seat seatDetail;
    Passanger passangerDetail;

    void showPassangerDetail(){

        System.out.println("Paasanger Name:"+ passangerDetail.passangerName);
        System.out.println("Passanger Age:"+passangerDetail.passangerAge);
        System.out.println("Passanger Address Details");
        System.out.println("Country:"+passangerDetail.passangerAdharDetail.passangerAddress.country);
        System.out.println("State:"+passangerDetail.passangerAdharDetail.passangerAddress.state);
        System.out.println("City:"+passangerDetail.passangerAdharDetail.passangerAddress.city);
        System.out.println("Pincode:"+passangerDetail.passangerAdharDetail.passangerAddress.pinCode);
        System.out.println("Adhar Number:"+passangerDetail.passangerAdharDetail.adharNumber);
        System.out.println("Train And Ticket Detail");
        System.out.println("Train Number:"+trainNumber);
        System.out.println("Seat Type:"+seatDetail.seatType);
        System.out.println("Seat Class:"+seatDetail.seatClass);
        System.out.println(time);
        System.out.println(dateOfArrival);
    }
}
