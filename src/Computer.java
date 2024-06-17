import java.util.Scanner;

public class Computer {
    String processor;
    int ram;
    int storage;
    Computer(String processor, int ram , int storage){
        this.processor=processor;
        this.ram=ram;
        this.storage=storage;
    }
    public static int calPrice(Computer c1){
        int price=0;
        switch(c1.storage){
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
        switch(c1.ram) {
            case 8:
                price += 12000;
                break;
            case 16:
                price += 17000;
                break;
        }
        switch (c1.processor) {
            case "intel":
                price += 40000;
                break;
            case "M1":
                price += 70000;
        }
        return price;
    }
    private static void print(Computer c1){
        System.out.println("Computer Details:");
        System.out.printf("Processor: %s\n",c1.processor);
        System.out.printf("Storage: %dgb\n",c1.storage);
        System.out.printf("Price: %d\n",calPrice(c1));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter details");
        System.out.println("Processor: \n1.intel\n2.M1");
        String processor= sc.next();
        System.out.println("Enter the storage:\n1.128\n2.256\n3.512");
        int storage= sc.nextInt();
        System.out.println("Enter the RAM:\n1.8\n2.16\n");
        int ram= sc.nextInt();
        Computer c1=new Computer(processor,ram,storage);
        print(c1);
    }
}
