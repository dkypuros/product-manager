package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @Service = Service Class
 * CLASS DIAGRAM =  "PRODUCT" SERVICE CLASS (ProductService.java)
 * CLASS DIAGRAM =	REPO NAME: PRODUCT REPOSITORY (ProductRepository)
 * At Run-time Spring Framework will manage an instance of this service class called "ProductService"
 */
@Service
public class ProductService {
/*
 * @Autowired = CRUD Methods
 * PRODUCT SERVICE = Provides basic CRUD methods via "@Autowired"
 * METHODS = listAll(), save(), get(id:Long), delete(id:Long)
 * private "instance fuse" that refers to the "product repository" repo
 * Spring Framework automatically injects an instance of the "product repository" via the annotation "Autowired"  
 */	
	@Autowired
	private ProductRepository repo;
/*
 * Start using CRUD methods created above by created methods.
 * Method returns data to "repository instance" via findAll();
 * =========== THINK ABOUT THE CLASS DIAGRAM TO OBSERVE DATA FLOW ========================== 
 * "ProductService" class is talking to "JpaRepository" class via "ProductRepository" class.
 * "listAll()" is in "ProductService" class and "findAll()" is in "JpaRepository" class.
 * note: "import java.util.List"
 */
	public List<Product> listAll() {
		return repo.findAll();
	}
/*
 * Second method to update "products"
 * We simply deliver the code to the repo. The "save()" method is already defined by Spring Data's API.
 * "save()" is in "JpaRepository" class. Don't have to write intermediate boilerplate code.
 * Just declare the repository interface in "ProductRepository.java" and reference "findById" or "deleteById"
 * ..or reference pre-defined CRUD methods.
 */
	public void save(Product product) {
		repo.save(product);
	}
	
	public Product get(Long id) {
		return repo.findById(id).get();
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
}