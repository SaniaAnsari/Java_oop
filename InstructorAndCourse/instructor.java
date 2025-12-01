package InstructorAndCourse;

public class instructor {

        private String name ;
        private String title;
        private int numInstructor;

        public instructor(String fn , String ln){
            name = fn + " " + ln;
            numInstructor++;
        }
        public String getName(){
            return name;
        }
        public int getNumInstructor(){
            return numInstructor;
        }
        public String toString(){
            return title +" "+name;
        }

    }

