package InstructorAndCourse;

import static InstructorAndCourse.Course.swapInstructors;

public class Main {
    public  static void main(String[]args) {
        instructor i1 = new instructor("sania", "Imran");
        instructor i2 = new instructor("zoha", "kamil");

        Course c1 = new Course("OOP", i1);

        Course c2 = new Course("DataBAse", i2);

        System.out.println(c1);
        System.out.println(c1);

        Course.swapInstructors(c1, c2);

        System.out.println("After swaping!");
        System.out.println(c1);

        System.out.println(c2);
    }
}

