public class NonSubscribersPassengers extends Passenger{

    private boolean discountCoupon;
    final double discount = 0.1;

    public NonSubscribersPassengers(String name, String ID, double tripCost, Car reservedCar, boolean discountCoupon) {
        super(name, ID, tripCost, reservedCar);
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    @Override
    void costClaculator() throws Exception {
        double tripCost=0;
        if(reservedCar.getCapacity() !=0) {
            if (discountCoupon == true) {
                tripCost = reservedCar.route.tripPrice - (reservedCar.route.tripPrice * discount);
            } else tripCost = reservedCar.route.tripPrice;
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
        System.out.println("Name: " + getName()+ "\nID: " + getID() +"\nSubscription: Not subscribed +\nHave a coupon? "+ discountCoupon +"\nTrip cost: "+ getTripCost());
    }
}
