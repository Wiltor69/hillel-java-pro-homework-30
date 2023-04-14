package ua.hillel.mapper;

import org.springframework.jdbc.core.RowMapper;
import ua.hillel.cart.Cart;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CartMapper implements RowMapper<Cart> {
    @Override
    public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
        rs.next();
        Cart cart = new Cart();
        cart.setId(rs.getInt("id"));
        return cart;
    }
}
