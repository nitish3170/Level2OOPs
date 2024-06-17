import java.util.Scanner;

public class Phone {
    String make;
    String model;
    int storage;
    Phone(String make,String model,int storage){
        this.make=make;
        this.model=model;
        this.storage=storage;
    }
    private static int calcPrice(Phone p1){
        int price=0;
        switch(p1.model){
            case "iPhone14":
                price+=50000;
                break;
            case "iPhone15":
                price+=60000;
                break;
            case "S23":
                price+=55000;
                break;
            case "S24":
                price+=65000;
                break;
        }
        switch(p1.storage){
            case 128:
                price+=10000;
                break;
            case 256:
                price+=15000;
                break;
            case 512:
                price+=20000;
                break;
        }
        return price;
    }
    private static void print(Phone p1){
        System.out.println("Phone Details:");
        System.out.printf("Maker: %s\n",p1.make);
        System.out.printf("Model: %s\n",p1.model);
        System.out.printf("Storage: %dgb\n",p1.storage);
        System.out.printf("Price: %d\n",calcPrice(p1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maker: \n1.Samsung\n2.Apple");
        String make=sc.next();
        String model="";
        if(make.equals("Apple")){
            System.out.println("Enter the model:\n1.iPhone14\n2.iPhone15");
            model= sc.next();
        }
        else{
            System.out.println("Enter the model:\n1.S23\n2.S24");
            model= sc.next();
        }
        System.out.println("Enter the storage:\n1.128\n2.256\n3.512");
        int storage= sc.nextInt();
        Phone p1=new Phone(make,model,storage);
        print(p1);
    }
}
