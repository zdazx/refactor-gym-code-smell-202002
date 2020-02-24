package cc.xpbootcamp.code_smell_recognise.$12;

import java.util.List;

public class Order {
    String customerName;
    String address;
    List<LineItem> lineItems;

    public Order(String customerName, String address, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.address = address;
        this.lineItems = lineItems;
    }

    private double totalPrice() {
        return lineItems.stream()
                .mapToDouble(lineItem -> lineItem.getPrice() * lineItem.getQuantity())
                .count();
    }
}
