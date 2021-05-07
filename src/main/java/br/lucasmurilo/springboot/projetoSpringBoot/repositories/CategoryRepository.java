package br.lucasmurilo.springboot.projetoSpringBoot.repositories;

import br.lucasmurilo.springboot.projetoSpringBoot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
