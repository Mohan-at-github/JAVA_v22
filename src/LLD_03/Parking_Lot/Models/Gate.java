package LLD_03.Parking_Lot.Models;

public class Gate extends BaseModel{
    private String name;
    private GateType type;
    private Operator operator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
