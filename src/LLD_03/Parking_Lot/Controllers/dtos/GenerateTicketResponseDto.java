package LLD_03.Parking_Lot.Controllers.dtos;

import LLD_03.Parking_Lot.Models.Ticket;


public class GenerateTicketResponseDto {
    private Ticket ticket;
    private Response response;

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
