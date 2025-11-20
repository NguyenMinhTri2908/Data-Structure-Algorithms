

public class Main {
    public static void main(String[] args) {
        // ... (khởi tạo Queue và Order ) ...
        
        OrderQueue queue = new OrderQueue(5);
        BookItem[] items1 = {new BookItem("Book Z", 1), new BookItem("Book A", 2), new BookItem("Book C", 1)};
        BookItem[] items2 = {new BookItem("Book B", 3), new BookItem("Book D", 1)};
        Order o1 = new Order(101, "Alice", "Hanoi", items1);
        Order o2 = new Order(102, "Bob", "HCM", items2);
        queue.enqueue(o1);
        queue.enqueue(o2);
        Order processed = queue.dequeue();
        System.out.println("Processing: " + processed);

        // ... (Phần in "Before sort") ...
        System.out.println("Before sort:");
        for (BookItem b : processed.getItems()) System.out.print(b + " | ");
        System.out.println();

        // THAY ĐỔI: Nhận số lần so sánh từ hàm sort
        long sortComparisons = SortingUtils.insertionSort(processed.getItems());

        System.out.println("After sort:");
        for (BookItem b : processed.getItems()) System.out.print(b + " | ");
        System.out.println();
        // THAY ĐỔI: In ra số lần so sánh
        System.out.println(">> Insertion Sort Comparisons: " + sortComparisons);


        // Search demo
        Order[] orders = {o1, o2};
        
        // THAY ĐỔI: Tạo mảng để lưu trữ số lần đếm
        long[] searchComparisons = new long[1]; 
        
        Order found = SearchingUtils.linearSearch(orders, 102, searchComparisons);
        System.out.println("Search result: " + found);
        // THAY ĐỔI: In ra số lần so sánh
        System.out.println(">> Linear Search Comparisons: " + searchComparisons[0]);

        // ... (Mã Stack demo) ...
        OrderStack stack = new OrderStack(5);
        stack.push(o1);
        stack.push(o2);
        System.out.println("Pop: " + stack.pop());
    }
}