import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Bill to info
        Scanner input = new Scanner(System.in);
        System.out.print("Bill to: ");
        String bill_to= input.nextLine();
        System.out.print("Residence: ");
        String residence_1=input.nextLine();
        System.out.print("Locality: ");
        String locality_1=input.nextLine();
        System.out.print("Tax ID: ");
        String tax_id_1=input.nextLine();
        System.out.print("Contact: ");
        String contact_1=input.nextLine();
        System.out.print("Email: ");
        String email_1=input.nextLine();

        //Ship to info
        System.out.print("Ship to: ");
        String ship_to= input.nextLine();
        System.out.print("Residence: ");
        String residence_2= input.nextLine();
        System.out.print("Locality: ");
        String locality_2= input.nextLine();
        System.out.print("Tax ID: ");
        String tax_id_2= input.nextLine();
        System.out.print("Contact: ");
        String contact_2= input.nextLine();
        System.out.print("Email: ");
        String email_2= input.nextLine();


        //Product info
        //P_1
        System.out.println("Serial no: ");
        int s_no_1= input.nextInt();
        System.out.println("Product code: ");
        int p_code_1= input.nextInt();
        input.nextLine();
        System.out.println("Product name: ");
        String p_name_1= input.nextLine();
        System.out.println("HSN Code: ");
        int HSN_code_1= input.nextInt();
        System.out.println("Quantity: ");
        int p1_qty= input.nextInt();
        input.nextLine();
        System.out.println("Units: ");
        String unit_1= input.nextLine();
        System.out.println("Rate: ");
        double p1_rate= input.nextDouble();
        System.out.println("Tax: ");
        int p1_tax= input.nextInt();

        //P_2
        System.out.println("Serial no: ");
        int s_no_2= input.nextInt();
        System.out.println("Product code: ");
        int p_code_2= input.nextInt();
        input.nextLine();
        System.out.println("Product name: ");
        String p_name_2= input.nextLine();
        System.out.println("HSN Code: ");
        int HSN_code_2= input.nextInt();
        System.out.println("Quantity: ");
        int p2_qty= input.nextInt();
        input.nextLine();
        System.out.println("Units: ");
        String unit_2= input.nextLine();
        System.out.println("Rate: ");
        double p2_rate= input.nextDouble();
        System.out.println("Tax: ");
        int p2_tax= input.nextInt();


        //P_3
        System.out.println("Serial no: ");
        int s_no_3= input.nextInt();
        System.out.println("Product code: ");
        int p_code_3= input.nextInt();
        input.nextLine();
        System.out.println("Product name: ");
        String p_name_3= input.nextLine();
        System.out.println("HSN Code: ");
        int HSN_code_3= input.nextInt();
        System.out.println("Quantity: ");
        int p3_qty= input.nextInt();
        input.nextLine();
        System.out.println("Units: ");
        String unit_3= input.nextLine();
        System.out.println("Rate: ");
        double p3_rate= input.nextDouble();
        System.out.println("Tax: ");
        int p3_tax= input.nextInt();


        //P_4
        System.out.println("Serial no: ");
        int s_no_4= input.nextInt();
        System.out.println("Product code: ");
        int p_code_4= input.nextInt();
        input.nextLine();
        System.out.println("Product name: ");
        String p_name_4= input.nextLine();
        System.out.println("HSN Code: ");
        int HSN_code_4= input.nextInt();
        System.out.println("Quantity: ");
        int p4_qty= input.nextInt();
        input.nextLine();
        System.out.println("Units: ");
        String unit_4= input.nextLine();
        System.out.println("Rate: ");
        double p4_rate= input.nextDouble();
        System.out.println("Tax: ");
        int p4_tax= input.nextInt();


        //P_5
        System.out.println("Serial no: ");
        int s_no_5= input.nextInt();
        System.out.println("Product code: ");
        int p_code_5= input.nextInt();
        input.nextLine();
        System.out.println("Product name: ");
        String p_name_5= input.nextLine();
        System.out.println("HSN Code: ");
        int HSN_code_5= input.nextInt();
        System.out.println("Quantity: ");
        int p5_qty= input.nextInt();
        input.nextLine();
        System.out.println("Units: ");
        String unit_5= input.nextLine();
        System.out.println("Rate: ");
        double p5_rate= input.nextDouble();
        System.out.println("Tax: ");
        int p5_tax= input.nextInt();


        //P_6
        System.out.println("Serial no: ");
        int s_no_6= input.nextInt();
        System.out.println("Product code: ");
        int p_code_6= input.nextInt();
        input.nextLine();
        System.out.println("Product name: ");
        String p_name_6= input.nextLine();
        System.out.println("HSN Code: ");
        int HSN_code_6= input.nextInt();
        System.out.println("Quantity: ");
        int p6_qty= input.nextInt();
        input.nextLine();
        System.out.println("Units: ");
        String unit_6= input.nextLine();
        System.out.println("Rate: ");
        double p6_rate= input.nextDouble();
        System.out.println("Tax: ");
        int p6_tax= input.nextInt();



        //P_7
        System.out.println("Serial no: ");
        int s_no_7= input.nextInt();
        System.out.println("Product code: ");
        int p_code_7= input.nextInt();
        input.nextLine();
        System.out.println("Product name: ");
        String p_name_7= input.nextLine();
        System.out.println("HSN Code: ");
        int HSN_code_7= input.nextInt();
        System.out.println("Quantity: ");
        int p7_qty= input.nextInt();
        input.nextLine();
        System.out.println("Units: ");
        String unit_7= input.nextLine();
        System.out.println("Rate: ");
        double p7_rate= input.nextDouble();
        System.out.println("Tax: ");
        int p7_tax= input.nextInt();


        //Calculations
        double p1taxValue = p1_qty * p1_rate * (p1_tax / 100.0);
        double p1amount = p1_qty * p1_rate + p1taxValue;

        double p2taxValue = p2_qty * p2_rate * (p2_tax / 100.0);
        double p2amount = p2_qty * p2_rate + p2taxValue;

        double p3taxValue = p3_qty * p3_rate * (p3_tax / 100.0);
        double p3amount = p3_qty * p3_rate + p3taxValue;

        double p4taxValue = p4_qty * p4_rate * (p4_tax / 100.0);
        double p4amount = p4_qty * p4_rate + p4taxValue;

        double p5taxValue = p5_qty * p5_rate * (p5_tax / 100.0);
        double p5amount = p5_qty * p5_rate + p5taxValue;

        double p6taxValue = p6_qty * p6_rate * (p6_tax / 100.0);
        double p6amount = p6_qty * p6_rate + p6taxValue;

        double p7taxValue = p7_qty * p7_rate * (p7_tax / 100.0);
        double p7amount = p7_qty * p7_rate + p7taxValue;


        double totalAmount = p1amount + p2amount + p3amount + p4amount + p5amount + p6amount + p7amount;
        double totalTax = p1taxValue + p2taxValue + p3taxValue + p4taxValue + p5taxValue + p6taxValue + p7taxValue;

        //discount
        double discount_Rate = 0.006368;
        double discount_Value = totalAmount * discount_Rate;
        double grandTotal = totalAmount - discount_Value;



        //output
        System.out.println("\n\n========================================= SALES INVOICE =======================================================");


        System.out.println(String.format("%-60s %-60s", "Bill To:", "Ship To:"));
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("%-60s %-60s", bill_to, ship_to));
        System.out.println(String.format("%-60s %-60s", residence_1, residence_2));
        System.out.println(String.format("%-60s %-60s", locality_1, locality_2));
        System.out.println(String.format("%-60s %-60s", "GSTIN: " + tax_id_1, "GSTIN: " + tax_id_2));
        System.out.println(String.format("%-60s %-60s", "Contact: " + contact_1, "Contact: " + contact_2));
        System.out.println(String.format("%-60s %-60s", "Email: " + email_1, "Email: " + email_2));
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("\tPayment date: 7 days from date of delivery\t\t\tPayment terms: 100% against invoice");
        System.out.println("---------------------------------------------------------------------------------------------------------------");


        // Table header
        System.out.println(String.format("|%-5s| %-12s| %-22s| %-10s| %8s| %6s| %10s| %10s| %10s|",
                "S.No", "Product Code", "Product Name", "HSN code", "Quantity", "Unit", "Rate", "Tax", "Amount"));

        System.out.println("--------------------------------------------------------------------------------------------------------------");

        // Rows (S.No 1..7)
        System.out.println(String.format("|%-5s| %-12s| %-22s| %-10s| %8s| %6s| %10.0f| %10s| %10.2f|",
                "1", p_code_1, p_name_1, HSN_code_1, p1_qty, unit_1, p1_rate, p1_tax+"%", p1amount));
        System.out.println(String.format("|%-5s| %-12s| %-22s| %-10s| %8s| %6s| %10.0f| %10s| %10.2f|",
                "2", p_code_2, p_name_2, HSN_code_2, p2_qty, unit_2, p2_rate, p2_tax+"%", p2amount));
        System.out.println(String.format("|%-5s| %-12s| %-22s| %-10s| %8s| %6s| %10.0f| %10s| %10.2f|",
                "3", p_code_3, p_name_3, HSN_code_3, p3_qty, unit_3, p3_rate, p3_tax+"%", p3amount));
        System.out.println(String.format("|%-5s| %-12s| %-22s| %-10s| %8s| %6s| %10.0f| %10s| %10.2f|",
                "4", p_code_4, p_name_4, HSN_code_4, p4_qty, unit_4, p4_rate, p4_tax+"%", p4amount));
        System.out.println(String.format("|%-5s| %-12s| %-22s| %-10s| %8s| %6s| %10.0f| %10s| %10.2f|",
                "5", p_code_5, p_name_5, HSN_code_5, p5_qty, unit_5, p5_rate, p5_tax+"%", p5amount));
        System.out.println(String.format("|%-5s| %-12s| %-22s| %-10s| %8s| %6s| %10.0f| %10s| %10.2f|",
                "6", p_code_6, p_name_6, HSN_code_6, p6_qty, unit_6, p6_rate, p6_tax+"%", p6amount));
        System.out.println(String.format("|%-5s| %-12s| %-22s| %-10s| %8s| %6s| %10.0f| %10s| %10.2f|",
                "7", p_code_7, p_name_7, HSN_code_7, p7_qty, unit_7, p7_rate, p7_tax +"%", p7amount));

        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("%95s |%10.2f|", "Total:", totalAmount));
        System.out.println(String.format("%95s |%10.2f|", "Discounts :", discount_Value));
        System.out.println(String.format("%95s |%10.2f|", "Grand Total:", grandTotal));
        System.out.println("================================================================================================================");

    }


}