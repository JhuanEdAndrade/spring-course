package com.andradejhuan.spring_course.repositories;

import com.andradejhuan.spring_course.entities.OrderItem;
import com.andradejhuan.spring_course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
