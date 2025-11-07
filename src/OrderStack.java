public class OrderStack {
    private Order[] data;
    private int top, capacity;

    public OrderStack(int capacity) {
        this.capacity = capacity;
        data = new Order[capacity];
        top = -1;
    }

    public void push(Order order) {
        if (top == capacity - 1) {
            System.out.println("Stack full!");
            return;
        }
        data[++top] = order;
        System.out.println("Pushed: " + order);
    }

    public Order pop() {
        if (isEmpty()) {
            System.out.println("Stack empty!");
            return null;
        }
        return data[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
