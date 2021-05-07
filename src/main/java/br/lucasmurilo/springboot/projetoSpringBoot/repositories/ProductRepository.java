package br.lucasmurilo.springboot.projetoSpringBoot.repositories;

import br.lucasmurilo.springboot.projetoSpringBoot.entities.Product;
import br.lucasmurilo.springboot.projetoSpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
