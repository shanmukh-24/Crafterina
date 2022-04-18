package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.OrderUser;
import com.example.demo.Model.Product;
import com.example.demo.Model.User;

@Component
@Repository
public interface OrderRepo extends JpaRepository<OrderUser,Integer> {
OrderUser findById(int id);
OrderUser findByUserAndProduct(User u,Product p);
List<OrderUser> findByUser(User user);
}