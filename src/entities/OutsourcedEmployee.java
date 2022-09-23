package entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double adicionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = adicionalCharge;
    }

    public Double getAdicionalCharge() {
        return additionalCharge;
    }

    public void setAdicionalCharge(Double adicionalCharge) {
        this.additionalCharge = adicionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
