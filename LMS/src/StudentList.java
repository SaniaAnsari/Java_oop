import java.util.ArrayList;
import java.util.Collections;


public class StudentList implements Cloneable {
    private Student[] students;
    private int size = 0;
    private int capacity;

    //default constructor
    public StudentList() {
        this.capacity = 50;
        this.students = new Student[50];
    }

    //parameterized constructor
    public StudentList(int capacity) {
        this.capacity = capacity;
        this.students = new Student[capacity];
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void ExpandCapacity() {
        capacity *= 2;
        Student[] newArray = new Student[capacity];
        //copy elements of old array
        for (int i = 0; i < size; i++) {
            newArray[i] = students[i];
        }
        students = newArray;
    }

    //add student at the end
    public boolean addStudents(Student s) {
/*
          // Check if SeatNo already exist
        for(int i=0;i<size;i++){
            if(students[i].getSeatNo()==s.getSeatNo()){
                System.out.println("Error: SeatNo already  exist");
                return false;
            }
        }

 */
        if (size == capacity) {
            ExpandCapacity();
        }
        students[size] = s;
        size++;
        return true;
    }

    //add students at specific index
    public boolean addStudents(int index, Student s) {
        if (index < 0 || index > size) {
            System.out.println("ERROR: INVALID INDEX");
            return false;
        }
        if (size == capacity) {
            ExpandCapacity();
        }
        //Right shift element
        for (int i = size; i > index; i--) {
            students[i] = students[i - 1];
        }
        //insert student
        students[index] = s;
        size++;
        return true;
    }

    public boolean removeBySeatNo(String seatNo) {
        for (int i = 0; i < size; i++) {
            if (students[i].getSeatNo().equals(seatNo)) {

                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[size - 1] = null;
                size--;
                return true;
            }
        }
        System.out.println("ERROR: SeatNo deosn't exist in the list!");
        return false;
    }

    public boolean removeByName(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    //  Search by Name
    public Student searchByName(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                return students[i];
            }
        }
        return null;
    }

    //  Search by Seat No
    public Student searchBySeatNo(String seatNo) {
        for (int i = 0; i < size; i++) {
            if (students[i].getSeatNo()==(seatNo)) {
                return students[i];
            }
        }
        return null;
    }

    //  Sort by Name
    public void sortByName() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // Sort by Seat No
    public void sortBySeatNo() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (students[j].getSeatNo().compareTo(students[j + 1].getSeatNo()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student List: \n");

        for (int i = 0; i < size; i++) {
            sb.append((i + 1) + ". " + students[i].toString() + "\n");
        }

        return sb.toString();
    }
}


