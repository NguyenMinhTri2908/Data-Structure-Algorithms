public class Order {
    private int orderId;
    private String customerName;
    private String shippingAddress;
    private String[] books;

    public Order(int orderId, String customerName, String shippingAddress, String[] books) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.books = books;
    }

    public int getOrderId() {
        return orderId;
    }

    public String[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Order{" + "ID=" + orderId + ", Customer=" + customerName + "}";
    }
}
