package com.shipment.demo.ShipmentTracking.service;

import java.util.List;

import com.shipment.demo.ShipmentTracking.entity.ShipmentAddress;

public interface IShipmentAddressService {
	
	public ShipmentAddress add(ShipmentAddress address);
	public ShipmentAddress update(ShipmentAddress address);
	List<ShipmentAddress> getAll();
	void deleteById(Integer id);
	public ShipmentAddress getById(Integer id);
	public ShipmentAddress getByFirstName(String firstName );
	public ShipmentAddress getByMobileNo(String mobileNo);
	

}
