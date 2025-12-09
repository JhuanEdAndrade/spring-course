package com.andradejhuan.spring_course.repositories;

import com.andradejhuan.spring_course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
