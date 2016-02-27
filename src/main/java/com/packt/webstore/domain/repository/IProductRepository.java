package com.packt.webstore.domain.repository;

import java.util.List;
import com.packt.webstore.domain.Product;

public interface IProductRepository {
	List <Product> getAllProducts();
	Product getProductById(String productID);
}
