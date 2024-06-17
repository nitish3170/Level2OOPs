import java.util.Scanner;

public class Dog {
    String breed;
    int age;
    float weight;
    Dog(String breed, int age, float weight){
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }
    private static void dogAge(Dog d1){
        System.out.printf("Dog age in human years : %.3f\n",16*Math.log(d1.age) + 31);
    }
    private static void print(Dog d1){
        System.out.printf("Breed: %s\n",d1.breed);
        System.out.printf("Age: %d\n",d1.age);
        System.out.printf("Weight: %.2f\n",d1.weight);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter dog's breed");
        String breed=sc.next();
        System.out.println("Enter dog's age");
        int age = sc.nextInt();
        System.out.println("Enter dog's weight");
        float weight= sc.nextFloat();
        Dog d1=new Dog(breed, age, weight);
        dogAge(d1);
        print(d1);
    }
}
