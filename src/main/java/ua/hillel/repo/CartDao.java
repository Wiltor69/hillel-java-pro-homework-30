package ua.hillel.repo;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ua.hillel.cart.Cart;
import ua.hillel.mapper.CartMapper;

@Repository
@RequiredArgsConstructor

public class CartDao implements CartRepo{

    private final JdbcTemplate jdbcTemplate;
    private final CartMapper cartMapper;
    @Override
    public void addProd(Integer id) {
        String sql = "INSERT INTO Product " +
                "id=? " ;
        jdbcTemplate.update(sql, id.intValue());

    }

    @Override
    public Cart findIdProd(Integer id) {
        String sql = "SELECT * FROM Product WHERE id = ? ";
        return jdbcTemplate.queryForObject(sql, new Object[] { id }, cartMapper);
    }

    @Override
    public void delProd(Integer id) {
        String sql = "DROP INTO Product " +
                "id=? " ;
        jdbcTemplate.update(sql, id.intValue());
    }
}
