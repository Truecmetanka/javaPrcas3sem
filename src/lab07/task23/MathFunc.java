package lab07.task23;

public class MathFunc implements MathCalculate {

    @Override
    public double toSecPower(double x) {
        return x*x;
    }

    @Override
    public double findModComplex(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }

    public double findLengthOfCircle(double r) {
        return Pi*r*r;
    }
}
