package train.detail;

import java.util.Date;

public class trainEntry {
    public static void main(String[] args) {

        TrainTicket passanger1 = new TrainTicket();
        passanger1.trainNumber = 235;

        passanger1.seatDetail = new Seat();
        passanger1.seatDetail.seatType = "Upper Seat";
        passanger1.seatDetail.seatClass = "First Class AC";

        passanger1.passangerDetail = new Passanger();
        passanger1.passangerDetail.passangerName = "Ravi Teja";
        passanger1.passangerDetail.passangerAge = 29;

        passanger1.passangerDetail.passangerAdharDetail = new Adhar();
        passanger1.passangerDetail.passangerAdharDetail.adharNumber = 1234567891;

        passanger1.passangerDetail.passangerAdharDetail.passangerAddress = new Address();
        passanger1.passangerDetail.passangerAdharDetail.passangerAddress.country = "India";
        passanger1.passangerDetail.passangerAdharDetail.passangerAddress.state = "Maharshtra";
        passanger1.passangerDetail.passangerAdharDetail.passangerAddress.city = "Pune";
        passanger1.passangerDetail.passangerAdharDetail.passangerAddress.pinCode = 415201;

        passanger1.showPassangerDetail();

    }
}
