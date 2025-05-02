public class myMain {
    public static void main (String[] args ){
  point3d point = new point3d(3,4,5);
        System.out.println(point.getX()+"//"+point.getY()+"//"+point.getZ());
        System.out.println("distance ="+ point.distance());
    }
}