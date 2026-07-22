package mn.icode.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mn.icode.model.Products;
import mn.icode.repository.ProductsRepository;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
private final ProductsRepository productsRepository;
	
	public ProductsController(ProductsRepository productsRepository) {
		this.productsRepository = productsRepository;
	}
	
	@GetMapping
	public List<Products> getAllProducts() {
		return productsRepository.findAll();
		
	}
	@GetMapping("/{id}")
 	public ResponseEntity<Products> getProductsById(@PathVariable Integer id) {
		Optional<Products> products = productsRepository.findById(id);
		
		
		return products.map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
}