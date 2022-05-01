package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.educandoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepositoryImplementation<Category, Long> {

}
