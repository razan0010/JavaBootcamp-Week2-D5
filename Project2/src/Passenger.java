public abstract class Passenger{
    private String name;
    private String ID;
    private double tripCost;
    Car reservedCar;

    public Passenger(String name, String ID, double tripCost, Car reservedCar) {
        this.name = name;
        this.ID = ID;
        this.tripCost = tripCost;
        this.reservedCar = reservedCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    abstract void costClaculator() throws Exception;

    abstract void displayInfo() throws Exception;
}
