package br.lucasmurilo.springboot.projetoSpringBoot.repositories;

import br.lucasmurilo.springboot.projetoSpringBoot.entities.OrderItem;
import br.lucasmurilo.springboot.projetoSpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
