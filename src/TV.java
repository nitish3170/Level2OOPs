import java.sql.SQLOutput;
import java.util.Scanner;

public class TV {
    String brand;
    int size;
    float price;
    TV(String brand,int size,float price){
        this.brand=brand;
        this.price=price;
        this.size=size;
    }
    private static int calcDiscount(int size){
        switch(size){
            case 55:
                return 5;
            case 65:
                return 7;
            case 70:
                return 9;
        }
        return 0;
    }
    private static void print(TV tv){
        System.out.println("TV details");
        System.out.printf("Brand: %s\n",tv.brand);
        System.out.printf("Size: %d\n",tv.size);
        System.out.printf("Discounted price: %.2f",tv.price+(tv.price*calcDiscount(tv.size)/100));
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter tv details: ");
        System.out.println("Select brand:\n1.Sony\n2.Samsung\n");
        String brand= sc.next();
        System.out.println("Select size: \n1.55\n2.65\n3.70");
        int size = sc.nextInt();
        System.out.println("Enter price: ");
        float price=sc.nextFloat();
        TV tv=new TV(brand,size,price);
        print(tv);
    }

}
