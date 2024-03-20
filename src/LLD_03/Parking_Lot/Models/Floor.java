package LLD_03.Parking_Lot.Models;

import java.util.List;

public class Floor extends BaseModel{
    private int floorNum;
    private List<Section> sections;
    private FloorStatus floorStatus;

    public void setSections(List<Section> sections)
    {
        this.sections=sections;
    }
    public List<Section> getSection()
    {
        return sections;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }
}
