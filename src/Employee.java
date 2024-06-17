import java.util.Scanner;

public class Employee {
    private int empId;
    private String name;
    private float salary;

    public Employee(int empId,String name,float salary) {
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }
    private static float annualSal(Employee e1){
        return e1.salary*12;
    }
    private static void print(Employee e1){
        System.out.printf("Employee name : %s\n",e1.name);
        System.out.printf("Employee : %.2f\n",annualSal(e1));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the ID: ");
        int empId= sc.nextInt();
        System.out.println("Enter the name of the employee: ");
        String name= sc.next();
        System.out.println("Enter the salary of employee: ");
        int age = sc.nextInt();
        Employee e1=new Employee(empId, name, age);
        print(e1);
    }
}
