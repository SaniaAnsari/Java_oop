package AircraftManagementSystem;
import java.util.ArrayList;
import java.util.List;

class Flight {
    private String flightNumber;
    private Airport source;
    private Airport destination;
    private Aircraft aircraft;
    private List<Passenger> passengers;

    public Flight(String flightNumber, Airport source, Airport destination,
                  Aircraft aircraft, List<Passenger> passengers) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.aircraft = aircraft;
        this.passengers = passengers ;
    }

    public void printPassengerList() {
        System.out.println("\n--- Passenger List of " + flightNumber + " ---");
        for (Passenger p : passengers) {
            System.out.println(p);  // uses toString of Passenger
        }
    }

    public void startFlight() {
        System.out.println("\n--- Flight Start Request ---");
        source.clearRunway();  //calling airport's method
        System.out.println(" Flight " + flightNumber + " departing from " + source);
        aircraft.takeOff(); // uses Aircraft toString
    }

    public void landFlight() {
        System.out.println("\n--- Preparing For Landing ---");
        destination.assignRunway();
        System.out.println(" Flight " + flightNumber + " arriving at " + destination);
        aircraft.land(); // uses Aircraft toString
    }
}


