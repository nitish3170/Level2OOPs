import java.util.Scanner;

public class BankAccount {
    private float balance=0;
    private int accountNumber;
    BankAccount(int accountNumber){
        this.accountNumber=accountNumber;
    }
    private static void depositMoney(BankAccount a1,float amount){
        a1.balance+=amount;
    }
    private static void withdrawMoney(BankAccount a1, float amount){
        a1.balance-=amount;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Account number");
        int acc= sc.nextInt();
        BankAccount b1=new BankAccount(acc);
        System.out.println("Enter the amount to be credited: ");
        float credit= sc.nextFloat();
        depositMoney(b1,credit);
        System.out.printf("Current balance: %f\n",b1.balance);
        System.out.println("Enter amount to be debited: ");
        float debit= sc.nextFloat();
        withdrawMoney(b1,debit);
        System.out.printf("Current balance: %f\n",b1.balance);
    }
}
