public class RunTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(5,2,3,4,5,6);
//        System.out.println(t1.getArea());
        t1.getArea();
        System.out.println(t1.getPerimeter());
        t1.maxAngle();
        t1.minAngle();
        t1.maxSide();
        t1.minSide();
    }
}
