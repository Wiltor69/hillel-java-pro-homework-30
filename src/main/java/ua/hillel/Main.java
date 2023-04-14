package ua.hillel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.hillel.cart.Cart;
import ua.hillel.product.Product;
import ua.hillel.repo.CartRepo;
import ua.hillel.repo.ProductRepo;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ua.hillel");
        ProductRepo productRepo = context.getBean(ProductRepo.class);
        CartRepo cartRepo = context.getBean(CartRepo.class);

        Cart cartId = cartRepo.findIdProd(1);
        Product product = new Product();
        product.setName("Computer");
        product.setPrice(536.55);
        Product addProduct = productRepo.add(product);

        Product product2 = new Product();
        product2.setName("Video");
        product2.setPrice(135.22);
        Product addProduct2 = productRepo.add(product2);

        Product product3 = new Product();
        product3.setName("SmartTV");
        product3.setPrice(200.50);
        Product addProduct3 = productRepo.add(product3);

        cartRepo.addProd(2);
        productRepo.findById(3);
        cartRepo.delProd(2);




    }
}
