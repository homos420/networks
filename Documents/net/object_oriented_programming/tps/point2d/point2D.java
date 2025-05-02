import java.util.Random;

public class point2D {

    private double x;
    private double y;

    public double rand() {
        Random rand = new Random();
        return rand.nextDouble(10);
    }


    public point2D() {
        setX(rand());
        setY(rand());
    }

    public point2D(double a, double b) {
        x = a;
        y = b;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    double distance() {
        return Math.sqrt(x * x + y * y);
    }

    double distance(point2D p) {

        return Math.sqrt((x - p.x) * (x - p.x) + (x - p.y) * (x - p.y));
    }

    public void print() {
        System.out.println("x=" + x + "y=" + y + " ");
    }

    public void printAll() {
        System.out.println("x=" + x + "y=" + y + "distance= " + distance());
    }

    public void change(double a, double b) {
        x = a;
        y = b;
    }

    public void move(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    public void rotate() {

        double t = x;
        x = y;
        y = -x;
    }

    static boolean isEqual(point2D a, point2D b) {
        return a.distance() == b.distance();
    }

    point2D merge(point2D a) {
        return new point2D(x + a.x, Math.max(y, a.y));
    }
}
