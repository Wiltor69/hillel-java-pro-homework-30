package ua.hillel.repo;

import ua.hillel.product.Product;

public interface ProductRepo {
    Product add(Product product);
    Product findById(Integer id);
    void delete (Product product);
}
