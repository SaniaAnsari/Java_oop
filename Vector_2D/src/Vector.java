public class Vector {
    public float dx;
    public float dy;

    public Vector(float dx,float dy){
        this.dx=dx;
        this.dy=dy;
    }

    public float getX(){
        return dx;
    }
    public void setDx(float dx){
        this.dx=dx;
    }
    public float getY(){
        return dy;
    }
    public void setDy(float dy){
        this.dy=dy;
    }

    public  Vector add(Vector other){
        return new Vector(this.dx+other.dx,this.dy+other.dy);
    }
    public  Vector subtract(Vector other){
        return new Vector(this.dx-other.dx,this.dy-other.dy);
    }
    public  float DotProduct(Vector other ){
        return (this.dx*other.dx+this.dy*other.dy);
    }
    public double magnitude(Vector other){
        return Math.sqrt(dx*dx+dy*dy);
    }
    @Override
    public String toString(){
        return("<"+dx+","+dy+">");
    }
}
