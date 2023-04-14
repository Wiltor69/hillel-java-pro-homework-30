package ua.hillel.product;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class Product {
    private Integer id;
    private String name;
    private Double price;
}
