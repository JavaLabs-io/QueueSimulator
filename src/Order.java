public class Order{
    private final int orderId;
    private final String customerName;
    private final String item;
    private final boolean isPriority;

    public Order(int orderId, String customerName, String item, boolean isPriority) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.item = item;
        this.isPriority = isPriority;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getItem() {
        return item;
    }

    public boolean isPriority() {
        return isPriority;
    }

        @Override
        public String toString(){
            return String.format("[%s] Order #%d | %s | Item: %s", isPriority ? "PRIORITY" : "REGULAR",
            orderId, customerName, item);
        }

}