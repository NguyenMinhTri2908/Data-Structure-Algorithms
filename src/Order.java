
public class Order {
    private int orderId;
    private String customerName;
    private String shippingAddress;
    private BookItem[] items; 

    
    public Order(int orderId, String customerName, String shippingAddress, BookItem[] items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    
    public BookItem[] getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order{" + "ID=" + orderId + ", Customer=" + customerName + "}";
    }
}