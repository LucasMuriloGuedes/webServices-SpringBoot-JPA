package br.lucasmurilo.springboot.projetoSpringBoot.repositories;

import br.lucasmurilo.springboot.projetoSpringBoot.entities.Order;
import br.lucasmurilo.springboot.projetoSpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
