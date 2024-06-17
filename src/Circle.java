import java.util.Scanner;

public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }
    private static void area(Circle c){
        System.out.printf("Area of circle : %f\n",3.14*c.radius*c.radius);
    }
    private static void circumference(Circle c){
        System.out.printf("Circumference of circle : %f",2*3.14*c.radius);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius: ");
        float r= sc.nextFloat();
        Circle c1=new Circle(r);
        area(c1);
        circumference(c1);
    }
}
