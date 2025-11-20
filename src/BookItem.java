
public class BookItem {
    private String title;
    private int quantity;

    public BookItem(String title, int quantity) {
        this.title = title;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        // Trả về chuỗi đẹp mắt để in ra
        return title + " (Qty: " + quantity + ")";
    }
}