package EqualsPractice;

public class RationalNumber {
    private final int num;
    private final  int den;

    public RationalNumber(int n, int d){
        assert d > 0;
        this.num = n;
        this.den = d;
    }
    @Override
    public boolean equals(Object other){
        if (other==null)
            return false;
        if (!(other instanceof RationalNumber))
            return false;
        RationalNumber that=(RationalNumber) other;
        return this.num==that.num && this.den==that.den;
    }
}
