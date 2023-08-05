
public class Main {
    public static void main(String[] args) {

        Route route = new Route("Street A", "Street B");

        Car car1 = new Car("0001", 4, route);
        Car car2 = new Car("0011", 2, route);
        Car car3 = new Car("0111", 0, route);


        Passenger passenger[] = new Passenger[3];
        passenger[0] = new SubscribersPassengers("BMW", "1000", 50, car1);
        passenger[1] = new NonSubscribersPassengers("Jeep", "1001", 40, car2 , true);
        passenger[2] = new NonSubscribersPassengers("Ford", "1011", 20, car3 , false);

        for (int i = 0; i < passenger.length; i++) {
            try {
                passenger[i].displayInfo();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("----------------");
        }
    }
}