package AircraftManagementSystem;
import java.util.ArrayList;
class Aircraft {
    private String id;
    private String type;
public Aircraft(String id, String type) {
    this.id = id;
    this.type = type;
}

public void takeOff() {
    System.out.println(type + " taking off...");
}

public void land() {
    System.out.println(type + " landing...");
}

@Override
public String toString() {
    return type + " " + id;
}
}
class Aeroplane extends Aircraft {
    public Aeroplane(String id) {
        super(id, "Aeroplane");
    }
}


