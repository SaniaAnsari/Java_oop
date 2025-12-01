import java.util.ArrayList;

public class CourseList {
    private int Semester;
    private ArrayList<Course>courses;

    public CourseList(int Semester){
        this.Semester=Semester;
        this.courses=new ArrayList<>();

        if(Semester==1){
            courses.add(new Course("Programming Fundamental",351));
            courses.add(new Course("Introduction to Information and Communication Technolgies",353));
            courses.add(new Course("Calculus and Analytical Geometry",355));
            courses.add(new Course("Applied Physics",357));
            courses.add(new Course("Functional English",359));
            courses.add(new Course("Islamic Studies",361));
        } else if (Semester==2) {
            courses.add(new Course("Object Oriented Programming",352));
            courses.add(new Course("Digital Logic Design",354));
            courses.add(new Course("Discrete Structure",358));
            courses.add(new Course("Linear Algebra",356));
            courses.add(new Course("Communication and Presentation Skills",362));
            courses.add(new Course("Ideology and Constitution of Pakistan",360));
        }
        else {
            System.out.println("Invalid Semester!");
        }

    }

    public CourseList() {

    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Semester: ").append(Semester).append("\nCourses:\n");
        for (Course c : courses) {
            sb.append(" - ").append(c.getCourseName())
                    .append(" (").append(c.getCourseNo()).append(")\n");
        }
        return sb.toString();
    }

/*
    @Override
    public String toString() {
        return "Semester"+Semester+"\n"+
                "courses"+courses;
    }

 */
}
