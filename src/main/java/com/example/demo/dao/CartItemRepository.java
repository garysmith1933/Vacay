package com.example.demo.dao;

import com.example.demo.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}

//You just finished task e, but you need to make sure everything works.
//More than likely you will need to adjust the column names to fit the database
//if any errors were to occur.