package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.orderDetails;

@Repository
public interface orderDetailsRepository extends JpaRepository<orderDetails,Long>{

}
