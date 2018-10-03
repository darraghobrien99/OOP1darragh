public class Fraction {

    private int numerator, denominator;

    //mutator

    public void setNumerator(int numerator) {

        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {

        this.denominator = denominator;
    }


    //accessor

    public int getNumerator(){

        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    //no argument constructor

    public Fraction() {

        this.numerator = 0;
        this.denominator = 1;
    }

    //2 arguments

    public Fraction(int numerator, int denominator)
    {

        setDenominator(denominator);
        setNumerator(numerator);
    }





}
