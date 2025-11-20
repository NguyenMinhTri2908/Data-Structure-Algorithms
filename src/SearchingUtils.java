

public class SearchingUtils {
    // THAY ĐỔI: Thêm tham số 'comparisonCount'
    // comparisonCount là mảng 1 phần tử (long[1]) để lưu trữ số lần đếm
    public static Order linearSearch(Order[] arr, int orderId, long[] comparisonCount) {
        comparisonCount[0] = 0; // Reset bộ đếm
        for (int i = 0; i < arr.length; i++) {
            comparisonCount[0]++; // TĂNG BỘ ĐẾM mỗi khi so sánh
            if (arr[i] != null && arr[i].getOrderId() == orderId) {
                return arr[i];
            }
        }
        return null;
    }

    
    public static Order linearSearch(Order[] arr, int orderId) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getOrderId() == orderId) {
                return arr[i];
            }
        }
        return null;
    }
}