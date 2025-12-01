package InstructorAndCourse;

public class Course {
        private instructor instructor;
        private String courseName;
        private static int instructorChange = 0;

        public Course(String s , instructor i ){
            courseName = s;
            instructor = i;
        }

        public String getCourseName() {
            return courseName;
        }
        public void setInstructor(instructor i){
            instructor = i;
            instructorChange++;
        }

        public instructor getInstructor() {
            return instructor;
        }

        public static int getInstructorChange() {
            return instructorChange;
        }
        public static void swapInstructors(Course c1 , Course c2){
            instructor temp = c1.instructor;
            c1.instructor = c2.instructor;
            c2.instructor = temp;
        }
        public String toString(){
            return "Course : " +courseName + " - Instructor : " +instructor.getName();
        }
    }

