public class Student implements Comparable<Student>{
    public String Name;
    public String SeatNo;
    public static int nextnumber=101;
    CourseList courselist;

    public Student(String Name,int Semester){
        this.Name=Name;
        //this.SeatNo=SeatNo;
       this.SeatNo="B24110006"+String.format("%3d",nextnumber);
        this.courselist= new CourseList(Semester);
        nextnumber++;

    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(String SeatNo) {
        this.SeatNo= SeatNo;
    }
    @Override
    public String toString(){
        return "Name=" + Name +"\n" +
                "SeatNo="+ SeatNo +"\n"+
                courselist;
    }

    public int compareTo(Student other){
       //return this.SeatNo-other.SeatNo;
         return this.getSeatNo().compareTo(other.getSeatNo());

    }





}
