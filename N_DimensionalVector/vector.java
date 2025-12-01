package N_DimensionalVector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

    public class vector implements Cloneable, Iterable<Double> {
        private ArrayList<Double> coordinates;

        //Constructor
        public vector(int length) {
            this.coordinates = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                coordinates.add(0.0);
            }
        }

        //getter
        public double get(int index) {
            return coordinates.get(index);
        }

        //setter
        public void set(int index, double value) {
            coordinates.set(index, value);
        }

        //dimension of vector
        public int length() {
            return coordinates.size();
        }

        //add another vector of same dimension
        public vector add(vector other) {
            if (this.length() != other.length()) {
                System.out.println("vector must have sme dimension");
            }
            vector result=new vector(this.length());
            for (int i=0;i<this.length();i++){
                result.set(i,this.get(i)+other.get(i));
            }
            return result;
        }
        //equal method
        @Override
        public boolean equals(Object o){
            if(this==o){
                return true;
            }
            if(!(o instanceof vector)) return false;
            vector other=(vector) o;
            return Objects.equals(this.coordinates,other.coordinates);
        }
        //clone method
        @Override
        public vector clone(){
            vector copy=new vector(this.length());
            //to copy loop elements
            for(int i=0;i<this.length();i++){
                copy.set(i,this.get(i));
            }
            return copy;
        }
        @Override
        public String toString(){
            return "vector"+coordinates.toString();
        }
        @Override
        public Iterator<Double> iterator() {
            return coordinates.iterator();
        }
    }


