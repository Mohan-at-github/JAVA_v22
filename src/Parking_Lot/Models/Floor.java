package Parking_Lot.Models;

import java.util.List;

public class Floor extends BaseModel{
    private int floorNum;
    private List<Section> sections;
    private  FloorStatus floorStatus;
}
