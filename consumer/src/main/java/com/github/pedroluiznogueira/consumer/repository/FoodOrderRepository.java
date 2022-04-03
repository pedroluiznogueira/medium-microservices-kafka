package com.github.pedroluiznogueira.consumer.repository;

import com.github.pedroluiznogueira.consumer.domain.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder, Long> {
}
