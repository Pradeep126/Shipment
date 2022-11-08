package com.shipment.demo.ShipmentTracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.shipment.demo.ShipmentTracking.entity.FromAddress;
import com.shipment.demo.ShipmentTracking.repository.FromAddressRepository;

@Service("fromaddressservice")
@Scope("singleton")
public class FromAddressService implements IFromAddressService {
	@Autowired
	@Qualifier("fromaddressrepository")
	private FromAddressRepository fromaddressrepository;

	@Override
	public FromAddress add(FromAddress address) {
		// TODO Auto-generated method stub
		return fromaddressrepository.save(address);
	}

	@Override
	public FromAddress update(FromAddress address) {
		// TODO Auto-generated method stub
		return fromaddressrepository.save(address);
	}

	@Override
	public List<FromAddress> getAll() {
		// TODO Auto-generated method stub
		return fromaddressrepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		fromaddressrepository.deleteById(id);
		
	}

	@Override
	public FromAddress getByDateMob(Integer dateMob) {
		// TODO Auto-generated method stub
		return fromaddressrepository.getByDateMob(dateMob);
	}

	@Override
	public FromAddress getByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return fromaddressrepository.getByFirstName(firstName);
	}

	@Override
	public FromAddress getByMobileNo(String mobileNo) {
		// TODO Auto-generated method stub
		return fromaddressrepository.getByMobileNo(mobileNo);
	}
}
	