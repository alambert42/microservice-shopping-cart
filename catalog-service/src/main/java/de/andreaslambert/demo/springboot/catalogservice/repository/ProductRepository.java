package de.andreaslambert.demo.springboot.catalogservice.repository;

import de.andreaslambert.demo.springboot.catalogservice.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByCode(String code);
}