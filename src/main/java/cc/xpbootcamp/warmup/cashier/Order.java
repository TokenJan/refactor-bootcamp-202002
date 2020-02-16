package cc.xpbootcamp.warmup.cashier;

import java.util.List;

public class Order {
    private String customerName;
    private String customerAddress;
    private List<LineItem> lineItemList;
    private double totalSalesTax;
    private double totalPrice;
    private double totalNetPrice;
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

        lineItemList.forEach(lineItem -> output.append(lineItem.toString()));
        totalNetPrice = lineItemList.stream().mapToDouble(LineItem::getTotalAmount).sum();
        totalSalesTax = totalNetPrice * TAX_RATE;
        totalPrice = totalNetPrice + totalSalesTax;

        output.append("Sales Tax").append('\t').append(totalSalesTax);
        output.append("Total Amount").append('\t').append(totalPrice);
        return output.toString();
    }
}
