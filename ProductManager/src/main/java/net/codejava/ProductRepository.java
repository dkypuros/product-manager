package net.codejava;

import org.springframework.data.jpa.repository.JpaRepository;;

/*
 * This connects/extends ProductRepository class to JpaRepository class via API
 * It uses the Primary Key via public class "Product" variable "id"
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
