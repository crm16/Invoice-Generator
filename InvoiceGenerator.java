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
        float discount = sc.nextFloat();

        System.out.printf("\n%25s\n","INVOICE");
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-40s %s\n","ITEM", "PRICE");

        for(int i = 0; i < numbers; i++){
            System.out.printf("%-38s INR. %.2f\n",items[i],price[i]);
            total += price[i];
        }

        System.out.println("___________________________________________________________________________");
        System.out.printf("%-38s INR. %.2f\n",   "Subtotal [without tax]",total);

        float tax = total * (taxPercentage/100);
        float taxTotal = total + tax;

        System.out.printf("%-38s INR. %.2f\n",  "Tax @" + String.format("%.2f", taxPercentage) + "%", tax);

        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-38s INR. %.2f\n",   "Net Payable Amount", taxTotal);
        System.out.printf("%-38s INR. %.2f\n",   "Applicable Discount", discount);
        System.out.println("---------------------------------------------------------------------------");

        float discountPrice = taxTotal - discount;
        System.out.printf("%-38s INR. %.2f\n",   "Adjusted Payable Amount", discountPrice);
        sc.close();
    }
}