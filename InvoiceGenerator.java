import java.util.*;
public class InvoiceGenerator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int numbers = sc.nextInt();

        String [] items = new String[numbers];
        float [] price = new float[numbers];
        for(int i = 0; i <numbers; i++){
            System.out.print("Enter item " + (i+1) +": ");
            sc.nextLine();
            items[i] = sc.nextLine();
            System.out.print("Price of " + items[i] + ": ");
            price[i] = sc.nextFloat();
        }

        System.out.print("Enter amount of tax [in %]: ");
        float taxPercentage = sc.nextFloat();
        float total = 0;

        System.out.print("Enter amount of discount [in INR]: ");
        float discount = sc.nextInt();

        System.out.println("\nINVOICE");
        System.out.println("---------------------------------------------------------------------------");

        for(int i = 0; i < numbers; i++){
            System.out.println(items[i] + "                                    INR. " + price[i]);
            total = total + price[i];
        }
        System.out.println("___________________________________________________________________________");
        System.out.println("Subtotal [without tax]                     INR. " + total);
        float tax = total * (taxPercentage/100);
        float taxTotal = total + tax;
        System.out.println("Tax @"+ taxPercentage +"%                                 INR. " + tax);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Net Payable Amount                         INR. " + taxTotal);
        System.out.println("Applicable Discount                        INR. " + discount);
        System.out.println("---------------------------------------------------------------------------");
        float discountPrice = taxTotal - discount;
        System.out.println("Adjusted Payable Amount                    INR. " + discountPrice);
        sc.close();
    }
}
