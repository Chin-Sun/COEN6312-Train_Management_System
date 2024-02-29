package Class;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private String customerId;
//    private List<MenuItem> itemsOrdered; // This should perhaps be a List<OrderItem> or Map<MenuItem, Integer>
    private List<OrderItem> itemsOrdered = new ArrayList<>();
    private Date orderDate;
    private String status;
    private double totalPrice;
//    private List<OrderItem> itemsOrdered;

    public Order(String orderId, String customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.itemsOrdered = new ArrayList<>();
        this.orderDate = new Date(); // Current date
        this.status = "pending";
    }

    // Methods to manage order items
    public void addItem(MenuItem item, int quantity) {
        // Check if item already exists, then update the quantity
        for (OrderItem orderItem : itemsOrdered) {
            if (orderItem.getItem().getItemId().equals(item.getItemId())) {
                orderItem.setQuantity(orderItem.getQuantity() + quantity);
                return;
            }
        }
        // If item doesn't exist, add it to the list
        itemsOrdered.add(new OrderItem(item, quantity));
    }

    public void removeItem(String itemId) {
        itemsOrdered.removeIf(orderItem -> orderItem.getItem().getItemId().equals(itemId));
    }

    public void updateItemQuantity(String itemId, int newQuantity) {
        for (OrderItem orderItem : itemsOrdered) {
            if (orderItem.getItem().getItemId().equals(itemId)) {
                if (newQuantity > 0) {
                    orderItem.setQuantity(newQuantity);
                } else {
                    itemsOrdered.remove(orderItem); // Remove the item if quantity is set to 0 or less
                    break; // Important to break as the list has been modified
                }
                return;
            }
        }
        System.out.println("Item not found in the order.");
    }

    public void calculateTotalPrice() {
        double total = 0;
        for (OrderItem orderItem : itemsOrdered) {
            total += orderItem.getItem().getPrice() * orderItem.getQuantity();
        }
        this.totalPrice = total;
        System.out.println("Total Price: " + totalPrice);
    }

    // Update the order status
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // Getters and Setters
    public double getTotalPrice() {
        return totalPrice;
    }
    public String getStatus(){
        return status;
    }

}
