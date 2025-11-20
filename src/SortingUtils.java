// File: src/SortingUtils.java (Cập nhật để đếm)

public class SortingUtils {
    
    // THAY ĐỔI: Trả về 'long' (số lần so sánh)
    public static long insertionSort(BookItem[] arr) {
        long comparisonCount = 0; // Bộ đếm
        
        for (int i = 1; i < arr.length; i++) {
            BookItem key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisonCount++; // TĂNG BỘ ĐẾM mỗi khi so sánh
                if (arr[j].getTitle().compareTo(key.getTitle()) > 0) {
                    arr[j + 1] = arr[j];
                    j--;
                } else {
                    break; // Dừng vòng lặp bên trong
                }
            }
            arr[j + 1] = key;
        }
        return comparisonCount; // Trả về tổng số lần so sánh
    }
}