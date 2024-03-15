package Parking_Lot.Controllers;

import Parking_Lot.Controllers.dtos.GenerateTicketRequestDto;
import Parking_Lot.Controllers.dtos.GenerateTicketResponseDto;
import Parking_Lot.Controllers.dtos.Response;
import Parking_Lot.Controllers.dtos.ResponseStatus;
import Parking_Lot.Exceptions.InvalidRequestException;
import Parking_Lot.Models.Ticket;
import Parking_Lot.Services.TicketService;
import com.sun.jdi.request.InvalidRequestStateException;

public class TicketController {

    private TicketService ticketService;
    //controller needs to talk to service, so controller should have object of service
    //via dependence injection we will have constructor

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    //now ticket_controller and ticket_service both class are concrete, which is violating DIP
    //we fix via abstraction by introducing interface in between them.
    GenerateTicketResponseDto responseDto=new GenerateTicketResponseDto();
    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto) {
        try {
            if (requestDto.getGateId() < 0) {
                throw new InvalidRequestException("Invalid gate id");
            }
            if (requestDto.getVehicleType() == null || requestDto.getVehicleType().equals("")) {
                throw new InvalidRequestException("Vehicle type is mandatory");
            }
        } catch (InvalidRequestException e) {
            Response response=new Response();
            response.setStatus(ResponseStatus.FAILED);
            response.setError(e.getMessage());
            responseDto.setResponse(response);
        }

       Response response=new Response();

        //now validation is done so we call service
        try {
            Ticket ticket =ticketService.generateTicket(requestDto.getGateId(), requestDto.getVehicleNumber(), requestDto.getVehicleType());
            responseDto.setTicket(ticket);
            response.setStatus(ResponseStatus.SUCCESS);

        }
        catch (Exception e){
            response.setStatus(ResponseStatus.FAILED);
            response.setError(e.getMessage());
        }
        responseDto.setResponse(response);
        return responseDto; //send to frontend via DTO object
    }
    //we should not pass a DTO object directly to service

}
