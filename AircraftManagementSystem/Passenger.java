package AircraftManagementSystem;
class Passenger {
    private String name;
    private String ticket;

    public Passenger(String name, String ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Passenger: " + name + " | ticket: " + ticket;
    }
}



















/*
public class Passenger {
   private  String name;
   private int ticketNo;

   public Passenger(String name,int ticketNo){
       this.name=name;
       this.ticketNo=ticketNo;
   }

    public String getName() {
        return name;
    }

    public int getTicketNo() {
        return ticketNo;
    }
    public String toString(){
       return "Name: "+name+" | TicketNo: "+ticketNo;
    }
}

 */
