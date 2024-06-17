import java.util.Scanner;

public class Student {
    private  int id;
    private String name;
    private int age;

    public Student(int id,String name, int age ){
        this.id = id;
        this.name=name;
        this.age=age;
    }
    private static void print(Student obj){
        System.out.printf("Name of the student: %s\n",obj.name);
        System.out.printf("Age of student: %d\n",obj.age);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the ID: ");
        int id= sc.nextInt();
        System.out.println("Enter the name of the student: ");
        String name= sc.next();
        System.out.println("Enter the age of student: ");
        int age = sc.nextInt();
        Student s1=new Student(id,name , age);
        print(s1);
    }
}