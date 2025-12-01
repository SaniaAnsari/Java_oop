package Point;

public class Line {
    private point start;
    private point end ;

    public Line( point p1,point p2) {
        this.start = p1;
        this.end = p2;
    }

    public void setStart(point start) {
        this.start = start;
    }

    public void setEnd(point end) {
        this.end = end;
    }

    public point getStart() {
        return start;
    }

    public point getEnd() {
        return end;
    }
    public double length(){
        return start.distance(end);
    }

    @Override
    public String toString() {
        return "Line from "+start+" to "+end;
    }
}

