package cc.xpbootcamp.warmup.cashier;

public class LineItem {
	private String description;
	private double price;
	private int quantity;

	public LineItem(String description, double price, int quantity) {
		super();
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

    double getTotalAmount() {
        return price * quantity;
    }

    @Override
	public String toString() {
		return description + '\t' +
				price + '\t' +
				quantity + '\t' +
				getTotalAmount() + '\n';
	}
}