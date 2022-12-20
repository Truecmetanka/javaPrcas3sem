package lab06.task11;

public class Celsium implements Convertable {
    private double degree;

    public Celsium(double degree) {
        this.degree = degree;
    }

    @Override
    public double[] convert() {
        double[] d = new double[2];
        d[0] = (degree * 9 / 5) + 32;
        d[1] = degree - 274;
        return d;
    }

}
