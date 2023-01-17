package dmit2015.model;

public class Rectangle {
    private double length;
    private double width;
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(){
        setWidth(1);
        setLength(1);
    }

    public Rectangle(double length, double width){
        setWidth(length);
        setLength(width);
    }

    public double Area() {
        return length * width;
    }

    public double Perimeter() {
        return 2 * (length + width);
    }

    public double Diagonal() {
        return Math.sqrt((width * width) + (length * length));
    }

    public void Print() {
        System.out.printf("The dimensions are l:%s and w:%s", this.length, this.width);
    }

    public static void Main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.Print();
    }
}
