package Parking_Lot.Services;

import Parking_Lot.Models.Ticket;

public interface TicketService {
    public Ticket generateTicket(int gateId, String vehicleNumber, String vehicleType) throws Exception;
    //this method can throw an exception when the parking lot is full
}
