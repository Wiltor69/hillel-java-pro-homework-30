package ua.hillel.repo;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ua.hillel.mapper.ProductMapper;
import ua.hillel.product.Product;
@Repository
@RequiredArgsConstructor
public class ProductDao implements ProductRepo{

    private final JdbcTemplate jdbcTemplate;
    private final ProductMapper productMapper;



    @Override
    public Product add(Product product) {
        String sql = "INSERT INTO Product " +
                "(name) " +
                "VALUES (?) ";
        jdbcTemplate.update(sql, product.getName());

        return product;
    }

    @Override
    public Product findById(Integer id) {
        String sql = "SELECT * FROM Product WHERE id = ? ";
        return jdbcTemplate.queryForObject(sql, new Object[] { id }, productMapper);

    }

    @Override
    public void delete(Product product) {
        String sql = "DROP INTO Product " +
                "(name) " +
                "VALUES (?) ";
        jdbcTemplate.update(sql, product.getName());

    }
}
