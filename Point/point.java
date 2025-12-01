package Point;

public class point {
    int x;
    int y;
    public point(int x,int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }
    public point add(point p){
        int newx=this.x+ p.x;
        int newy=this.y+p.y;
        return new point(newx,newy);
    }
    public point subtract(point p){
        int newx=this.x- p.x;
        int newy=this.y-p.y;
        return new point(newx,newy);
    }
    public double distance(point p){
        int dx=this.x- p.x;
        int dy=this.y-p.y;
        return Math.sqrt(dx*dx+dy*dy);
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
}
