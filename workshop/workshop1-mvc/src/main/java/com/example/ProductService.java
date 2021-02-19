package com.example;

import java.util.List;
import java.util.Optional;

public interface ProductService {

	public abstract int addProduct(Product product);
	public abstract List<Product> getAllProduct();
	public abstract void delProduct(int id);
	public abstract Optional<Product> getProduct(int id);
}
