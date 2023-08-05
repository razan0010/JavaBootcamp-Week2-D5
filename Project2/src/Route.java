public class Route {
    private String startPickUpAddress;
    private String destinationAddress;
    final int tripPrice =50;

    public Route(String startPickUpAddress, String destinationAddress) {
        this.startPickUpAddress = startPickUpAddress;
        this.destinationAddress = destinationAddress;
    }

    public String getStartPickUpAddress() {
        return startPickUpAddress;
    }

    public void setStartPickUpAddress(String startPickUpAddress) {
        this.startPickUpAddress = startPickUpAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

     void displayInfo(){
         System.out.println("Start pick up address: "+ startPickUpAddress +"\nDestination address: "+ destinationAddress);
     }

}
