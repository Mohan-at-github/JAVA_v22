package LLD_03.Parking_Lot.Services;

import LLD_03.Parking_Lot.Models.Ticket;

public interface TicketService {
    public Ticket generateTicket(int gateId, String vehicleNumber, String vehicleType) throws Exception;
    //if parking lot is full it throws an exception
}
