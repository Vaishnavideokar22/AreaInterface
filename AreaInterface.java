interface Shape{
    void GetArea();
}
class Rectangle implements Shape{
    double area;
    double width;
    double length;

    Rectangle(double Width,double Length){
        this.width = Width;
        this.length = Length;
}
public void GetArea(){
    area =  width*length;
    System.out.println("The Area of Rectangle is :" + area);
}
}
class Circle implements Shape{
    double area;
    double radius;

    Circle(double Radius){
        this.radius = Radius;
}
public void GetArea(){
    area = 3.14*radius*radius;
    System.out.println("The Area of Circle is :" + area);
}
}
class Triangle implements Shape{
    double area;
    double base;
    double height;

    Triangle(double Base , double Height){
        this.base = Base;
        this.height = Height;
}
public void GetArea(){
    area = 1/2*base*height;
    System.out.println("The Area of Triangle is :" + area);
}
}
public class AreaInterface {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(88,99);
        r1.GetArea();

        Circle c1 = new Circle(66);
        r1.GetArea();

        Triangle t1 = new Triangle(99,54);
        t1.GetArea();

    }
    
}
