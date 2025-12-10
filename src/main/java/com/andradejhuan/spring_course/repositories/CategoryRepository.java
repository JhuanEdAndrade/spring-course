package com.andradejhuan.spring_course.repositories;

import com.andradejhuan.spring_course.entities.Category;
import com.andradejhuan.spring_course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
