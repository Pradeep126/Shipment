package com.shipment.demo.ShipmentTracking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shipment.demo.ShipmentTracking.entity.FromAddress;
import com.shipment.demo.ShipmentTracking.service.IFromAddressService;


@RestController
@Scope("request")
@RequestMapping("/from")
@CrossOrigin("*")
public class FromAddressController {
	@Autowired
	@Qualifier("fromaddressservice")
	private IFromAddressService fromaddress;

	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String dummy() {
		return "working";
	}

	@PostMapping(value = "/add", produces = { MediaType.APPLICATION_JSON_VALUE })
	public FromAddress add(@RequestBody FromAddress address) {
		// TODO Auto-generated method stub
		return fromaddress.add(address);
	}
	
	@PutMapping(value="/update",produces = { MediaType.APPLICATION_JSON_VALUE })
	public FromAddress update(@RequestBody FromAddress address) {
		// TODO Auto-generated method stub
		return fromaddress.update(address);
	}
	@GetMapping(value="/getall",produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<FromAddress> getAll() {
		// TODO Auto-generated method stub
		return fromaddress.getAll();
	}
	@DeleteMapping(value="/deletebydatemob/{dateMob}",produces = { MediaType.APPLICATION_JSON_VALUE })
	public void deleteBydateMob(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		fromaddress.deleteById(id);
	}
	@PostMapping(value="/getbydatemob/{dateMob}",produces = { MediaType.APPLICATION_JSON_VALUE })
	public FromAddress getByDateMob(Integer dateMob) {
		// TODO Auto-generated method stub
		System.out.println("Entered datemob");
		return fromaddress.getByDateMob(dateMob);
	}
	@PostMapping(value="/getbyfirstname/{firstName}",produces = { MediaType.APPLICATION_JSON_VALUE })
	public FromAddress getByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return fromaddress.getByFirstName(firstName);
	}
	@PostMapping(value="/getbymobno/{mobileNo}",produces = { MediaType.APPLICATION_JSON_VALUE })
	public FromAddress getByMobileNo(String mobileNo) {
		// TODO Auto-generated method stub
		return fromaddress.getByMobileNo(mobileNo);
	}

}

