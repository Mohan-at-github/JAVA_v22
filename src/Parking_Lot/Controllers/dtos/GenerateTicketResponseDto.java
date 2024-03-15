package Parking_Lot.Controllers.dtos;

import Parking_Lot.Models.Ticket;

public class GenerateTicketResponseDto {
    private Ticket ticket;
    private Response response;
    // if status is failed that means my Ticket value will be null, we wont get any ticket
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}



