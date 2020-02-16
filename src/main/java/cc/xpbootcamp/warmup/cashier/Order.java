package cc.xpbootcamp.warmup.cashier;

import java.util.List;

public class Order {
    private String customerName;
    private String customerAddress;
    private List<LineItem> lineItemList;
    private double totalSalesTax = 0d;
    private double total = 0d;
    private static final double TAX_RATE = .10;

    public Order(String customerName, String customerAddress, List<LineItem> lineItemList) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.lineItemList = lineItemList;
    }

    public String getReceipt() {
        StringBuilder output = new StringBuilder();
        output.append("======Printing Orders======\n");
        output.append(customerName);
        output.append(customerAddress);

        for (LineItem lineItem : lineItemList) {
            output.append(lineItem.toString());
            double salesTax = lineItem.getTotalAmount() * TAX_RATE;
            totalSalesTax += salesTax;
            total += lineItem.getTotalAmount() + salesTax;
        }

        output.append("Sales Tax").append('\t').append(totalSalesTax);
        output.append("Total Amount").append('\t').append(total);
        return output.toString();
    }
}
