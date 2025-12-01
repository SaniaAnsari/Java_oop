package AircraftManagementSystem;

class Airport {
    private String name;
    private String city;

    public Airport(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void clearRunway() {
        System.out.println(" Runway cleared at " + name);
    }

    public void assignRunway() {
        System.out.println(" Runway assigned for landing at " + name);
    }

    @Override
    public String toString() {
        return name + " (" + city + ")";
    }
}

