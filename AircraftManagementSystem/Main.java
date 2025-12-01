package AircraftManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Airport Karachi = new Airport("Karachi Airport", "Karachi");
        Airport Lahore = new Airport("Lahore Airport", "Lahore");
        Airport Islamabad=new Airport("Ialamabad Airport", "Islamabad");

        //flight 1
        Aircraft a1 = new Aeroplane("PIA-006");
        List<Passenger> list1 = new ArrayList<>();
        list1.add(new Passenger("Sania", "PK12345"));
        list1.add(new Passenger("Ayesha", "PK67890"));
        list1.add(new Passenger("zoha", "PK11122"));
        Flight f1=new Flight("PIA-006",Karachi,Islamabad,a1,list1);

        //flight 2
        Aircraft a2 = new Aeroplane("PIA-007");
        List<Passenger> list2 = new ArrayList<>();
        list2.add(new Passenger("liaba", "PK12345"));
        list2.add(new Passenger("Areeba", "PK67890"));
        list2.add(new Passenger("Wajeeha", "PK11122"));
        Flight f2 = new Flight("PIA-007", Karachi, Lahore, a2, list2);

        //flight 1
        System.out.println("\n===============Flight 1=================\n");
        f1.printPassengerList();
        f1.startFlight();
        f1.landFlight();

        //flight2
        System.out.println("\n===============Flight 2=================\n");
        f2.printPassengerList();
        f2.startFlight();
        f2.landFlight();
    }
}
