package com.example.oblig3_v1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    void deleteById(Integer id);

    List<Order> findByOrderByName();
}
