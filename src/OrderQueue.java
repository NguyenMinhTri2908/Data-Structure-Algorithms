public class OrderQueue {
    private Order[] data;
    private int front, rear, size, capacity;

    public OrderQueue(int capacity) {
        this.capacity = capacity;
        data = new Order[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(Order order) {
        if (size == capacity) {
            System.out.println("Queue full!");
            return;
        }
        rear = (rear + 1) % capacity;
        data[rear] = order;
        size++;
        System.out.println("Enqueued: " + order);
    }

    public Order dequeue() {
        if (isEmpty()) {
            System.out.println("Queue empty!");
            return null;
        }
        Order order = data[front];
        front = (front + 1) % capacity;
        size--;
        return order;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
