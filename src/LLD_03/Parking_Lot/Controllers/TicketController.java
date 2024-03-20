package LLD_03.Parking_Lot.Controllers;
import LLD_03.Parking_Lot.Controllers.dtos.GenerateTicketRequestDto;
import LLD_03.Parking_Lot.Controllers.dtos.GenerateTicketResponseDto;
import LLD_03.Parking_Lot.Controllers.dtos.Response;
import LLD_03.Parking_Lot.Controllers.dtos.ResponseStatus;
import LLD_03.Parking_Lot.Exceptions.InvalidRequestException;
import LLD_03.Parking_Lot.Models.Ticket;
import LLD_03.Parking_Lot.Services.TicketService;

public class TicketController {
    //controller to communicate with service it required a service object
    private TicketService ticketService; //here an object type is interface

    public TicketController(TicketService ticketService)
    {
        this.ticketService=ticketService;
    }
    GenerateTicketResponseDto responseDto =new GenerateTicketResponseDto();
    //the below method works only to get the data from the user and give to controller and vise versa
    public GenerateTicketResponseDto TicketGenerate(GenerateTicketRequestDto requestDto)
    {
        //let's do validation and then send data to service to get ticket
        //try catch block for validation also
    try {
        if (requestDto.getGateId() == 0) {
            throw new InvalidRequestException("Invaid gate ID");
        }

        if (requestDto.getVehicleType() == null || requestDto.getVehicleType().equals("")) {
            throw new InvalidRequestException("Vehicle type is mandatory");
        }
    }
    catch(Exception e)
    {
        Response response=new Response();
        response.setResponseStatus(ResponseStatus.FAILED);
        response.setErrorMessage(e.getMessage());
        responseDto.setResponse(response);
        return responseDto;
    }


        //like this, we can perform multiple validation and once done, we can pass to service to generate ticket
        Response response=new Response();
        //try catch block for ticket generation
        try{
            Ticket ticket = ticketService.generateTicket(requestDto.getGateId(),requestDto.getVehicleNum(),requestDto.getVehicleType());
            responseDto.setTicket(ticket);
            response.setResponseStatus(ResponseStatus.SUCCESS);
        }
        catch (Exception e) {
            response.setResponseStatus(ResponseStatus.FAILED);
            response.setErrorMessage(e.getMessage());
        }
        responseDto.setResponse(response);
          return responseDto;
    }



}
