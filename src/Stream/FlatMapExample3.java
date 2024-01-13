package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Order {
    private String orderId;
    private List<String> items;

    public Order(String orderId, List<String> items) {
        this.orderId = orderId;
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }
}

public class FlatMapExample3 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("order1", Arrays.asList("item1", "item2", "item3")),
                new Order("order2", Arrays.asList("item2", "item3", "item4")),
                new Order("order3", Arrays.asList("item3", "item4", "item5"))
        );

        List<String> distinctItems = orders.stream()
                .flatMap(order -> order.getItems().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctItems);
    }
}


