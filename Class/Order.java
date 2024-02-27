import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private String customerId;
    private List<MenuItem> itemsOrdered;
    private Date orderDate;
    private String status;
    private double totalPrice;

    public Order(String orderId, String customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.itemsOrdered = new ArrayList<>();
        this.orderDate = new Date(); // Current date
        this.status = "pending";
    }

    public void addItem(MenuItem item, int quantity) {
        items.add(item);
    }

    public void removeItem(String itemId) {
        items.removeIf(item -> item.getItemId().equals(itemId));
    }

    public void updateItemQuantity(String itemId, int newQuantity) {
      for (OrderItem orderItem : itemsOrdered) {
          if (orderItem.getItem().getItemId().equals(itemId)) {
              if (newQuantity > 0) {
                  orderItem.setQuantity(newQuantity);
              } else {
                  itemsOrdered.remove(orderItem); // Remove the item if quantity is set to 0 or less
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
      this.totalPrice = total; // Assuming totalPrice is an attribute of Order class
      System.out.println("Total Price: " + totalPrice);
  }
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}
