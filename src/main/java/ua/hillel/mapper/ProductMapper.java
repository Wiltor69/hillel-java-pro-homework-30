package ua.hillel.mapper;

import org.springframework.jdbc.core.RowMapper;
import ua.hillel.cart.Cart;
import ua.hillel.product.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        rs.next();
        Product product = new Product();
        product.setId(rs.getInt("id"));
        product.setName(rs.getString("name"));
        product.setPrice(rs.getDouble("price"));
        Cart cart = new Cart();
        cart.setId(rs.getInt("id"));
        cart.setProductList((List<Product>) product);
        return product;
    }
}
