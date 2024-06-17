import java.util.Scanner;

public class Furniture {
    String type;
    String material;
    float price;
    Furniture(String type,String material,float price){
        this.material=material;
        this.type=type;
        this.price=price;
    }
    private static int calcDiscount(String material){
        switch(material){
            case "wood":
                return 5;
            case "plastic":
                return 7;
            case "metal":
                return 9;
        }
        return 0;
    }
    private static void print(Furniture f1){
        System.out.println("Furniture details");
        System.out.printf("Material: %s\n",f1.material);
        System.out.printf("Type: %s\n",f1.type);
        System.out.printf("Discounted price: %.2f",f1.price+(f1.price*calcDiscount(f1.material)/100));
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter furniture details: ");
        System.out.println("Select material:\n1.wood\n2.plastic\n3.metal");
        String material= sc.next();
        System.out.println("Select type: \n1.chair\n2.bed\n3.sofa");
        String type = sc.next();
        System.out.println("Enter price: ");
        float price=sc.nextFloat();
        Furniture f1=new Furniture(type,material,price);
        print(f1);
    }
}
