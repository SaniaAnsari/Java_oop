package EqualsPractice2;

public class RationalNumber {
    private final int num;
    private final  int den;

    public RationalNumber(int n, int d){
        assert d > 0;
        this.num = n;
        this.den = d;
    }
    public boolean equals(RationalNumber r){
        return this.num==r.num && this.den==r.den;
    }
}
