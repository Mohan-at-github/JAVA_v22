package LLD_03.Parking_Lot.Controllers.dtos;

import LLD_03.Parking_Lot.Controllers.dtos.GenerateTicketResponseDto;

public class GenerateTicketRequestDto {
    private String vehicleNum;
    private int gateId;
    private String vehicleType;

    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
