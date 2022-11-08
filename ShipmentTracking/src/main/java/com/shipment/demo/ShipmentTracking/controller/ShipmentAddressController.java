package com.shipment.demo.ShipmentTracking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shipment.demo.ShipmentTracking.entity.ShipmentAddress;
import com.shipment.demo.ShipmentTracking.service.IShipmentAddressService;

@RestController
@Scope("request")
@RequestMapping("/ship")
public class ShipmentAddressController {
	@Autowired
	@Qualifier("shipmentaddressservice")
	private IShipmentAddressService shipmentaddress;

	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String dummy() {
		return "working";
	}

	@PostMapping(value = "/add", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ShipmentAddress add(@RequestBody ShipmentAddress address) {
		// TODO Auto-generated method stub
		return shipmentaddress.add(address);
	}
	
	@PutMapping(value="/update",produces = { MediaType.APPLICATION_JSON_VALUE })
	public ShipmentAddress update(@RequestBody ShipmentAddress address) {
		// TODO Auto-generated method stub
		return shipmentaddress.update(address);
	}
	@GetMapping(value="/getall",produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<ShipmentAddress> getAll() {
		// TODO Auto-generated method stub
		return shipmentaddress.getAll();
	}
	@DeleteMapping(value="/deletebydatemob/{dateMob}",produces = { MediaType.APPLICATION_JSON_VALUE })
	public void deleteBydateMob(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		shipmentaddress.deleteById(id);
	}
	@PostMapping(value="/getbyid/{id}",produces = { MediaType.APPLICATION_JSON_VALUE })
	public ShipmentAddress getById(Integer id) {
		// TODO Auto-generated method stub
		return shipmentaddress.getById(id);
	}
	@PostMapping(value="/getbyfirstname/{firstName}",produces = { MediaType.APPLICATION_JSON_VALUE })
	public ShipmentAddress getByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return shipmentaddress.getByFirstName(firstName);
	}
	@PostMapping(value="/getbymobno/{mobileNo}",produces = { MediaType.APPLICATION_JSON_VALUE })
	public ShipmentAddress getByMobileNo(String mobileNo) {
		// TODO Auto-generated method stub
		return shipmentaddress.getByMobileNo(mobileNo);
	}

}
