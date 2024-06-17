import java.util.Scanner;

public class Shirt {
    String size;
    String color;
    float price;
    Shirt(String  size,String color,float price){
        this.size=size;
        this.color=color;
        this.price=price;
    }
    private static int calcDiscount(String size){
        switch(size){
            case "s":
                return 5;
            case "m":
                return 7;
            case "l":
                return 9;
        }
        return 0;
    }
    private static void print(Shirt sh){
        System.out.println("Shirt details");

        System.out.printf("Size: %s\n",sh.size);
        System.out.printf("color: %s\n",sh.color);
        System.out.printf("Discounted price: %.2f",sh.price+(sh.price*calcDiscount(sh.size)/100));
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Shirt details: ");
        System.out.println("Select color:");
        String color= sc.next();
        System.out.println("Select size: \n1.s\n2.m\n3.l");
        String size =sc.next();
        System.out.println("Enter price: ");
        float price=sc.nextFloat();
        Shirt sh=new Shirt(size,color,price);
        print(sh);
    }

}
