public class SalesTax {
    public static void main(String[] args)
    {
        double tax = .05;
        double purchasePrice = 40.00;
        double salesTax;


        salesTax = purchasePrice * tax;

        System.out.println("The price is " + purchasePrice + " and your sales tax is " + salesTax );

    }
}