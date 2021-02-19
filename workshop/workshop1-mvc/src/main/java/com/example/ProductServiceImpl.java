package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository pr;
	
	@Override
	public int addProduct(Product product) {
		pr.save(product);
		return 0;
	}

	@Override
	public List<Product> getAllProduct() {
		return pr.findAll();
	}

	@Override
	public void delProduct(int id) {
		pr.deleteById(id);
	}

	@Override
	public Optional<Product> getProduct(int id) {
		return pr.findById(id);
	}

}
