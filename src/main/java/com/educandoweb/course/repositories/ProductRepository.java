package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.educandoweb.course.entities.Product;

public interface ProductRepository extends JpaRepositoryImplementation<Product, Long> {

}
