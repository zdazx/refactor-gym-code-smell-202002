package cc.xpbootcamp.code_smell_recognise.$16;

public class Order {

    private Sku sku;

    private String buyerName;
    private String buyerPhoneNumber;
    private String buyerAddress;

    public Order(Sku sku, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.sku = sku;
        this.buyerName = buyerName;
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }
}

