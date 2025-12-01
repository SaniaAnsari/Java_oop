package RANGE;

public class Range {
    int start;
    int end;
    public  Range(int end){
        this.start=0;
        this.end =end;
    }
    public  Range(int start,int end){
        this.start=start;
        this.end =end;
    }
    public int getStart(){
        return start;
    }

    public int getEnd() {
        return end;
    }
    public boolean contains(int num){
        return num>=start&&num<=end;
    }
    public  int size(){
        return end-start+1;

    }public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = start; i <= end; i++) {
            sb.append(i);
            if (i < end) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
