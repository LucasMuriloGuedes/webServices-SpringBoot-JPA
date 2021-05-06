package br.lucasmurilo.springboot.projetoSpringBoot.services;

import br.lucasmurilo.springboot.projetoSpringBoot.entities.Order;
import br.lucasmurilo.springboot.projetoSpringBoot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}

