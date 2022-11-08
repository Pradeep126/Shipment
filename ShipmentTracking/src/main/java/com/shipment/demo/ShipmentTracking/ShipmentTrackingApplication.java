package com.shipment.demo.ShipmentTracking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shipment.demo.ShipmentTracking.entity.FromAddress;
import com.shipment.demo.ShipmentTracking.entity.ShipmentAddress;
import com.shipment.demo.ShipmentTracking.entity.User;
import com.shipment.demo.ShipmentTracking.repository.FromAddressRepository;
import com.shipment.demo.ShipmentTracking.repository.ShipmentAddressRepository;
import com.shipment.demo.ShipmentTracking.repository.UserRepository;

@SpringBootApplication
public class ShipmentTrackingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShipmentTrackingApplication.class, args);
	}
	@Autowired
	@Qualifier("shipmentaddressrepository")
	private ShipmentAddressRepository shipmentaddressrepository;
	
	@Autowired
	@Qualifier("fromaddressrepository")
	private FromAddressRepository fromaddressrepository;
	@Autowired
	@Qualifier("userrepository")
	private UserRepository userrepository;
	@Override
	public void run(String... args) throws Exception {
		shipmentaddressrepository.save(new ShipmentAddress(0,"Dhivya","Jagadeesan","Lakshmi","05/10/2021","9807654321","Laptop","Annanagar","Annanagar","Chennai",600009));
		fromaddressrepository.save(new FromAddress(1,"Dhivya","Jagadeesan","Lakshmi","05/10/2021","9807654321","Laptop","Annanagar","Annanagar","Chennai",600009));
        userrepository.save(new User(2,"Pradeep","thunder","Admin","User1"));
		
		
	}

}
