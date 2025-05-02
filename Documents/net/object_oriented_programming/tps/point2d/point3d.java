public class point3d extends point2D {
    private double z;

    public point3d(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public point3d() {
        setX(rand());
        setY(rand());
        z = rand();
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return this.z;
    }

@Override
    double distance(){
         return Math.sqrt(getX() * getX() + getY() * getY()+ getZ()* getZ());
}
@Override
public void print(){
    System.out.println("x="+getX()+"");
}
}
