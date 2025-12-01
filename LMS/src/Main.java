import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the
public class Main {
    public static void main(String[] args)  {

        StudentList dcs = new StudentList();
        System.out.println("dcs creates an empty student list");


        dcs.addStudents(new Student("Ahmed", 1));
        dcs.addStudents(new Student("Ayesha", 2));
        dcs.addStudents(new Student("Bilal", 1));



        System.out.println("New admission added to dcs");
        System.out.println(dcs);


        //Add student at specific index
        dcs.addStudents(1, new Student("Fatima", 2));
        System.out.println("-------Student add at specific Index-------");
        System.out.println("Fatima add at index 1: "+dcs);

        //remove by seatNo
        dcs.removeBySeatNo("B2411000101");
        System.out.println();
        System.out.println("Remove Student at seatno B2411000101: "+dcs);

        //remove by name
        dcs.removeByName("Ayesha");
        System.out.println();
        System.out.println("Remove Ayesha: "+dcs);

        //search by name
        dcs.searchByName("Bilal");
        System.out.println();
        System.out.println("Bialal dound at index 2: "+dcs);

        //search by seatno
        dcs.searchBySeatNo("B24110006101");
        System.out.println();
        System.out.println("SeatNo b24110006101: "+dcs);

        //sort by name
        dcs.sortByName();
        System.out.println();
        System.out.println(dcs);

        //sort bt seatNo
        dcs.sortBySeatNo();
        System.out.println();
        System.out.println(dcs);

        System.out.println("Current size:" + dcs.getSize());
        System.out.println("Current Capacity" + dcs.getCapacity());
    }
}






