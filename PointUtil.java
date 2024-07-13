package gr.aueb.cf.ch15.homework;

public class PointUtil {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point2D(3, 4);
        Point p3 = new Point3D(3, 4, 5);


        System.out.println(getDistanceFromOrigin(p1));
        System.out.println(getDistanceFromOrigin(p2));
        System.out.println(getDistanceFromOrigin(p3));

    }
    public static double getDistanceFromOrigin(Point point) {
        return point.getDistanceFromOrigin();
    }

}
