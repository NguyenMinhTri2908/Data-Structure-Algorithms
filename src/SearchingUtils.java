public class SearchingUtils {
    public static Order linearSearch(Order[] arr, int orderId) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getOrderId() == orderId) {
                return arr[i];
            }
        }
        return null;
    }
}
