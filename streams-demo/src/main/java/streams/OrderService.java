package streams;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class OrderService {

    private List<Order> orders = new ArrayList<>();


    public void saveOrder(Order order) {
        orders.add(order);
    }

    public long countOrdersByStatus(String status) {
        return orders.stream()
                .filter(s -> s.getStatus().equals(status))
                .count();
    }

    public List<Order> collectOrdersWithProductCategory(String category) {
        return orders.stream()
                .filter(o -> o.getProducts()
                        .stream()
                        .anyMatch(p -> p.getCategory().equals(category)))
                .collect(Collectors.toList());
    }

    public List<Product> productsOverAmountPrice(int ammount) {
        return orders.stream()
                .flatMap(order -> order.getProducts()
                        .stream())
                .filter(product -> product.getPrice() > ammount)
                .collect(Collectors.toList());

    }

    public List<Product> productsOverAmountPriceOnce(int ammount) {
        return orders.stream()
                .flatMap(order -> order.getProducts()
                        .stream())
                .filter(product -> product.getPrice() > ammount)
                .distinct()
                .collect(Collectors.toList());
    }
}
