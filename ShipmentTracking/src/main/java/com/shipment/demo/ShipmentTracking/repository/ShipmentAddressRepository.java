package com.shipment.demo.ShipmentTracking.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shipment.demo.ShipmentTracking.entity.ShipmentAddress;

@Repository("shipmentaddressrepository")
@Scope("singleton")
public interface ShipmentAddressRepository extends JpaRepository<ShipmentAddress,Integer>{

	ShipmentAddress getById(Integer id);

	ShipmentAddress getByFirstName(String firstName);

	ShipmentAddress getByMobileNo(String mobileNo);

}
