import java.util.Random;

public class circle {
    private point2D centerPoint;
    private double radius;

    // Default constructor:
    public circle() {
        Random rand = new Random();
        this.centerPoint = new point2D(rand.nextDouble(10), rand.nextDouble(10));
        this.radius = rand.nextDouble(10);
    }

    public circle(point2D center, double radius) {
        this.centerPoint = center;
        this.radius = radius;
    }

    public circle(double radius) {
        this.centerPoint = new point2D(0, 0);
        this.radius = radius;
    }

    // Getters
    public point2D getCenterPoint() {
        return centerPoint;
    }

    public double getRadius() {
        return radius;
    }

    // Setters
    public void setCenterPoint(point2D centerPoint) {
        this.centerPoint = centerPoint;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
   public double area(){
        return Math.PI * radius* radius;
   }
   public double perimeter()
   {
       return 2 * Math.PI * radius;
   }
  public boolean isInside(point2D a ){
        return a.distance(centerPoint)<=this.radius;
  }
}
