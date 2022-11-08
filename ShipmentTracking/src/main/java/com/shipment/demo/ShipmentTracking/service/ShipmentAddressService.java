package com.shipment.demo.ShipmentTracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.shipment.demo.ShipmentTracking.entity.ShipmentAddress;
import com.shipment.demo.ShipmentTracking.repository.ShipmentAddressRepository;

@Service("shipmentaddressservice")
@Scope("singleton")
public class ShipmentAddressService implements IShipmentAddressService {
	@Autowired
	@Qualifier("shipmentaddressrepository")
	private ShipmentAddressRepository shipmentaddressrepository;

	@Override
	public ShipmentAddress add(ShipmentAddress address) {
		// TODO Auto-generated method stub
		return shipmentaddressrepository.save(address);
	}

	@Override
	public ShipmentAddress update(ShipmentAddress address) {
		// TODO Auto-generated method stub
		return shipmentaddressrepository.save(address) ;
	}

	@Override
	public List<ShipmentAddress> getAll() {
		// TODO Auto-generated method stub
		return shipmentaddressrepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		shipmentaddressrepository.deleteById(id);
		// TODO Auto-generated method stub

	}

	@Override
	public ShipmentAddress getById(Integer id) {
		// TODO Auto-generated method stub
		return shipmentaddressrepository.getById(id);
	}

	@Override
	public ShipmentAddress getByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return shipmentaddressrepository.getByFirstName(firstName);
	}

	@Override
	public ShipmentAddress getByMobileNo(String mobileNo) {
		// TODO Auto-generated method stub
		return shipmentaddressrepository.getByMobileNo(mobileNo);
	}

}
