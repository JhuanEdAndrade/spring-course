package com.andradejhuan.spring_course.repositories;

import com.andradejhuan.spring_course.entities.Category;
import com.andradejhuan.spring_course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
