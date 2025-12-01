import java.util.ArrayList;

public class Course {
    private String CourseName;
    private int CourseNo;

    public Course(String CourseName,int CourseNo){
        this.CourseName=CourseName;
        this.CourseNo=CourseNo;
    }
    public String getCourseName(){
        return CourseName;
    }

    public int getCourseNo() {
        return CourseNo;
    }

    @Override
    public String toString() {
        return "CourseName"+CourseName+"\n"+
                "CourseNo"+CourseNo;
    }
}
