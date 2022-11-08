package com.shipment.demo.ShipmentTracking.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shipment.demo.ShipmentTracking.entity.FromAddress;
import com.shipment.demo.ShipmentTracking.entity.ShipmentAddress;

@Repository("fromaddressrepository")
@Scope("singleton")
public interface FromAddressRepository extends JpaRepository<FromAddress,Integer>{
	FromAddress getByDateMob(Integer dateMob);

	FromAddress getByFirstName(String firstName);

	FromAddress getByMobileNo(String mobileNo);
	

}
