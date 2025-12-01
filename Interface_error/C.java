package Interface_error;

public interface C {
    public  int m();
    public abstract int n();
}
abstract class D implements C{
    @Override
    public int m(){
        return 3;
    }
}
class E extends D{
    @Override
    public int n() {
        return 4;
    }
        //provide another concrete method o()
        public int o(){
            return 5;
        }
    }

class F extends E{
    // no extra code needed; inherit o(), m(), n()
}