package dmit2015.model;


/**
 * This class models a Circle shape.
 *
 * @author Sam Wu
 * @version 2023-20-1
 */
public class Circle {
    //Do not use underscore (_) prefix unless it's for internal usage.
    private double radius;

    /**
     * Returns the radius of this circle
     * @return the radius of this circle
     */
    public double getRadius() {
        return radius;
    }

    //Exception example
//    public void setRadius(double radius) throws Exception {
//        //Validate teh new value assigned to the Radius
//        if(radius <= 0){
//            throw new Exception("Radius must be a positive non-zero number.");
//        }
//        this.radius = radius;
//    }

    //RuntimeException example

    /**
     * Change the radius of this circle
     * @param radius the new radius of this circle
     */
    public void setRadius(double radius) {
        //Validate teh new value assigned to the Radius
        if(radius <= 0){
            throw new RuntimeException("Radius must be a positive non-zero number.");
        }
        this.radius = radius;
    }

    /**
     * Creates a circle with a radius of 1
     */
    public Circle() {
        this.radius = 1;
    }

    /**
     * Creates a circle with a specific radius
     * @param radius the new radius of this circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Compute and return the area of this circle
     * @return the area of this circle
     */
    public double Area() {
        return Math.PI * radius * radius;
    }

    /**
     * Computer and return the perimeter of this circle
     * @return the circumference of this circle
     */
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    public void PrintCircle() {
        //If value is string, use %s; %d for whole number, %f for floating number, %t for time
        //  Example using .println
        //  System.out.println("The radius of circle 1 is " + this.getRadius());
        System.out.printf("The radius of circle1 is %s\n", this.getRadius());
        //%.5f prints values to 5 decimal places. %.2f prints values to 2 decimal places
        System.out.printf("The area of circle1 is %.5f\n", this.Area());
        System.out.printf("The area of circle1 is %.2f\n", this.Perimeter());
    }

    public static void main(String[] args) {
        //New circle object should have default radius of 1
        Circle circle1 = new Circle();

        circle1.PrintCircle();

        circle1.setRadius(5);

        circle1.PrintCircle();

        try {
            circle1.setRadius(-25);
            System.out.println("An exception should have been thrown");
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
