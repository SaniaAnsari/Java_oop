package department;

public class ComputerScience extends Department{
    String HOD;


    public ComputerScience(String depName, String HOD) {
        super(depName);
        this.HOD=HOD;
    }
    public String toString(){
        return ("Department: "+depName+" HOD: "+HOD);
    }
}
