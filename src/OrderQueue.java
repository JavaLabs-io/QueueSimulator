import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {

    private final Queue<Order> priorityQueue = new LinkedList<>();
    private final Queue<Order> regularQueue  = new LinkedList<>();
    private int totalOrders = 0;

    public void enqueue(String customerName, String item, boolean isPriority) {
        totalOrders++;
        Order order = new Order(totalOrders, customerName, item, isPriority);

        if (isPriority) {
            priorityQueue.offer(order);
            System.out.println("Enqueued (PRIORITY): " + order);
        } else {
            regularQueue.offer(order);
            System.out.println("Enqueued  (REGULAR): " + order);
        }
    }

    public Order dequeue() {
        if (!priorityQueue.isEmpty()) {
            Order served = priorityQueue.poll();
            System.out.println("Serving  (PRIORITY): " + served);
            return served;
        } else if (!regularQueue.isEmpty()) {
            Order served = regularQueue.poll();
            System.out.println("Serving   (REGULAR): " + served);
            return served;
        } else {
            System.out.println("No orders in the queue.");
            return null;
        }
    }

    public Order searchOrder(int orderId) {
    for (Order order : priorityQueue) {
        if (order.getOrderId() == orderId) {
            return order;
        }
    }

    for (Order order : regularQueue) {
        if (order.getOrderId() == orderId) {
            return order;
        }
    }

    return null;
}

    public Order peek() {
        if (!priorityQueue.isEmpty()) return priorityQueue.peek();
        return regularQueue.peek();
    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty() && regularQueue.isEmpty();
    }

    public int size() {
        return priorityQueue.size() + regularQueue.size();
    }

    public void displayQueue() {
        System.out.println("\n--- Current Queue ---");
        System.out.println("Priority orders (" + priorityQueue.size() + "):");
        priorityQueue.forEach(o -> System.out.println("  " + o));
        System.out.println("Regular orders  (" + regularQueue.size() + "):");
        regularQueue.forEach(o -> System.out.println("  " + o));
        System.out.println("---------------------\n");
    }
}