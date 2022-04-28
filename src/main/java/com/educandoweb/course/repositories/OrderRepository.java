package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.educandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long> {

}
