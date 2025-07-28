import java.util.*;
public class InvoiceGenerator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int size = sc.nextInt();
        System.out.println();

        String [] itemName = new String[size];
        float [] unitPrice = new float[size];
        int [] quantity = new int[size];
        float [] totalPrice = new float[size];

        //to take input and store data
        for(int i = 0 ; i < size ; i++){
            sc.nextLine();
            System.out.print("Enter name of item " + (i+1) + ": ");
            itemName[i] = sc.nextLine();
            System.out.print("Enter unit price of " + itemName[i] + ": ");
            unitPrice[i] = sc.nextFloat();
            System.out.print("Enter quantity of " + itemName[i] + ": ");
            quantity[i] = sc.nextInt();
            totalPrice[i] = (unitPrice[i] * quantity[i]);
            System.out.println();
        }
        //tax percentage as user input
        System.out.print("Enter amount of tax [in %]: ");
        float taxPercent = sc.nextFloat();

        //discount percentage as user input
        System.out.print("Enter amount of discount [in %]: ");
        float discPercentage = sc.nextFloat();

        float total = 0;

        //optional feature company name
//        sc.nextLine();
//        System.out.print("Enter company name: ");
//        String cName = sc.nextLine();

        System.out.println();
        System.out.println("============================================================================");

        //        System.out.printf("%40s\n", cName);
        System.out.printf("%40s\n", "INVOICE");

        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%6s %-25s %10s %10s %10s\n", "|S.NO|","|ITEM NAME|","|UNIT PRICE|","|QUANTITY|","|TOTAL PRICE|");
        System.out.println("----------------------------------------------------------------------------");

        // to print data
        for(int i = 0 ; i < size ; i++){
            System.out.printf("%3d %5s %-20s %10.2f %10d %7s %.2f\n",(i+1),"",itemName[i],unitPrice[i],quantity[i],"",totalPrice[i]);
            total += totalPrice[i];
        }

        System.out.println("____________________________________________________________________________");
        System.out.printf("%-60s %.2f\n","Sub-total [without tax]",total);

        //to calculate tax
        float tax = total * (taxPercent/100);
        float taxTotal = total + tax;

        System.out.printf("%-60s %.2f\n","Tax @ " + String.format("%.2f",taxPercent) + "%",tax);
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-60s %.2f\n","Net Payable Amount",taxTotal);

        //to calculate discount
        float discount = taxTotal*(discPercentage/100);
        System.out.printf("%-60s %.2f\n","Applicable Discount @ " + String.format("%.2f", discPercentage) +"%",discount);

        System.out.println("----------------------------------------------------------------------------");
        float adjustablePrice = taxTotal-discount;
        System.out.printf("%-60s %.2f\n","Grand Total Payable",adjustablePrice);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();

        //note
        System.out.printf("%s\n","--------------NOTE--------------");
        System.out.printf("%4s%s\n","","** Prices are in INR. **");
        System.out.printf("%s\n","--------------------------------");

        System.out.println();
        // to generate date
        Date date = new Date();
        System.out.printf("%40s %s\n","Generated on:",date);
        System.out.println("============================================================================");
        sc.close();
    }
}