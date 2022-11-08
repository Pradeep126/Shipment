package com.shipment.demo.ShipmentTracking.service;

import java.util.List;

import com.shipment.demo.ShipmentTracking.entity.FromAddress;


public interface IFromAddressService {

	public FromAddress add(FromAddress address);
	public FromAddress update(FromAddress address);
	List<FromAddress> getAll();
	void deleteById(Integer id);
	public FromAddress getByDateMob(Integer dateMob);
	public FromAddress getByFirstName(String firstName );
	public FromAddress getByMobileNo(String mobileNo);
	


}
