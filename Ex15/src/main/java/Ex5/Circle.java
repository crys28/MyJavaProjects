package Ex5;

/**
 *
 * @author nsirbu
 */
public class Circle extends Shape {
    
    private Point center;
    private int radius;
    
    public Circle(Point point, int radius) {
        this.center = point;
        this.radius = radius;
    }
    
    public double getDiameter() {
        return 2 * radius;
    }
    
    @Override
    public void move(double dx, double dy) {
//        center.setX(center.getX() + dx);
//        center.setY(center.getY() + dy);

        center.move(dx, dy);
    }
    
    @Override
    public double getSurface() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }
}
