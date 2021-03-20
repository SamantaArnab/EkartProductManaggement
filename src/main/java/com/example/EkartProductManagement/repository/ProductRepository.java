//package com.example.EkartProductManagement.repository;
//
//import com.example.EkartProductManagement.model.Product;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.core.namedparam.SqlParameterSource;
//import org.springframework.stereotype.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//@Repository
//public class ProductRepository {
//
//    private final String getAll_query = "SELECT * from products";
//    private final String getById_query = "SELECT * from products where prodId = :id";
//
//    @Autowired
//    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//    public List<Product> findAllProducts() {
//
//        return namedParameterJdbcTemplate.query(getAll_query, new ProductMapper());
//    }
//
//    public Product findProductById(Integer id) {
//        SqlParameterSource namedParameters = new MapSqlParameterSource()
//                .addValue("id", id);
//        return namedParameterJdbcTemplate.queryForObject(getById_query, namedParameters, new ProductMapper());
//    }
//}
//
//class ProductMapper implements RowMapper<Product> {
//
//    @Override
//    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//        Product product = new Product();
//        product.setProdId(rs.getLong("prodId"));
//        product.setDisplayName(rs.getString("displayName"));
////        product.setShortDesc(rs.getString("shortDesc"));
////        product.setDesc(rs.getString("desc"));
////        product.setCategory(rs.getString("category"));
//        product.setPrice(rs.getInt("price"));
//        return product;
//    }
//}