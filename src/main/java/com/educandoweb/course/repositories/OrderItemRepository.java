package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.educandoweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepositoryImplementation<OrderItem, Long> {

}
