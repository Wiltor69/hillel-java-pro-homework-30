package ua.hillel.repo;

import ua.hillel.cart.Cart;
import ua.hillel.product.Product;

public interface CartRepo {
    void addProd(Integer id);
    Cart findIdProd(Integer id);
    void delProd (Integer id);


}
