package Class;
import java.util.ArrayList;
import java.util.List;

public class Restaurants {
    private String restaurantId;
    private String name;
    private String location;
    private String cuisineType;
    private Menu menu;
    private String operatingHours;
    private List<ServerForFood> serverForFoodList = new ArrayList<>();

    public Restaurants(String restaurantId, String name, String location, String cuisineType, Menu menu, String operatingHours) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.location = location;
        this.cuisineType = cuisineType;
        this.menu = menu;
        this.operatingHours = operatingHours;
        this.serverForFoodList = new ArrayList<>();
    }

    public void addServerForFood(ServerForFood server) {
        serverForFoodList.add(server);
    }

    public void removeServerForFood(String serverId) {
        serverForFoodList.removeIf(server -> server.getServerId().equals(serverId));
    }

    public void updateMenu(Menu newMenu) {
        this.menu = newMenu;
    }
    public Menu getMenu(){
        return this.menu;
    }

    public void processOrder(Order order) {
        // Implementation
    }


    public String displayMenu() {
        String menuItems = menu.listItems();
        System.out.println(menuItems);
        return menu.listItems();
    }
    public List getServerForFoodList(){
        return serverForFoodList;
    }
}
