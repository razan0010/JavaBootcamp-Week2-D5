public class SubscribersPassengers extends Passenger{

    final double discount=0.5;

    public SubscribersPassengers(String name, String ID, double tripCost, Car reservedCar) {
        super(name, ID, tripCost, reservedCar);
    }

    @Override
    void costClaculator() throws Exception{
        double tripCost;
        if(reservedCar.getCapacity() !=0) {
             tripCost = reservedCar.route.tripPrice - (reservedCar.route.tripPrice * discount);
        }
        else {
           throw new Exception("The maximum capacity of the car equal to zero.");
        }
        super.setTripCost(tripCost);
    }

    @Override
    void displayInfo() throws Exception {
        super.reservedCar.displayInfo();
        costClaculator();
        System.out.println("Name: " + getName()+ "\nID: " + getID() +"\nSubscription: subscriber\nTrip cost: " + getTripCost());
    }

}
