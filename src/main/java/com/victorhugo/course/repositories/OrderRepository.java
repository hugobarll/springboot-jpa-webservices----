package com.victorhugo.course.repositories;

import com.victorhugo.course.entities.Order;
import com.victorhugo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
