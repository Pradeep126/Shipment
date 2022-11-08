package com.shipment.demo.ShipmentTracking.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shipment.demo.ShipmentTracking.entity.User;


@Repository("userrepository")
@Scope("singleton")
public interface UserRepository extends JpaRepository<User, Integer>{

}
