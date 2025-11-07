public class Main {
    public static void main(String[] args) {
        // Queue demo
        OrderQueue queue = new OrderQueue(5);
        Order o1 = new Order(101, "Alice", "Hanoi", new String[]{"Book Z", "Book A", "Book C"});
        Order o2 = new Order(102, "Bob", "HCM", new String[]{"Book B", "Book D"});

        queue.enqueue(o1);
        queue.enqueue(o2);

        // Process order (dequeue)
        Order processed = queue.dequeue();
        System.out.println("Processing: " + processed);

        // Sort books in processed order
        System.out.println("Before sort:");
        for (String b : processed.getBooks()) System.out.print(b + " ");
        System.out.println();

        SortingUtils.insertionSort(processed.getBooks());

        System.out.println("After sort:");
        for (String b : processed.getBooks()) System.out.print(b + " ");
        System.out.println();

        // Search demo
        Order[] orders = {o1, o2};
        Order found = SearchingUtils.linearSearch(orders, 102);
        System.out.println("Search result: " + found);

        // Stack demo
        OrderStack stack = new OrderStack(5);
        stack.push(o1);
        stack.push(o2);
        System.out.println("Pop: " + stack.pop());
    }
}
