package ua.hillel.cart;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import ua.hillel.product.Product;

import java.util.List;

@Data
@ToString

public class Cart {
    Integer id;
    private List<Product> productList;
}
