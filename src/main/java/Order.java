public class Order {
    private String orderId;
    private double amount;
    private String item;

    public Order() {
    }

    public Order(String orderId, double amount, String item) {
        this.orderId = orderId;
        this.amount = amount;
        this.item = item;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", amount=" + amount +
                ", item='" + item + '\'' +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
