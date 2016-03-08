package com.packt.webstore.domain.repository.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Product;
import com.packt.webstore.service.IProductService;
import com.packt.webstore.domain.repository.IProductRepository;;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository productRepository;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.getAllProducts();
	}

	public Product getProductById(String productID) {
		// TODO Auto-generated method stub
		return productRepository.getProductById(productID);
	}

	public List<Product> getProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return productRepository.getProductsByCategory(category);
	}

	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		// TODO Auto-generated method stub
		return productRepository.getProductsByFilter(filterParams);
	}

}
