package com.shipment.demo.ShipmentTracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shipment.demo.ShipmentTracking.entity.User;
import com.shipment.demo.ShipmentTracking.service.AuthService;



@RestController
@Scope("request")
@RequestMapping("/User")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
	@Qualifier("Authservice")
	@Autowired
	private AuthService authService;

	@PostMapping("/register")
	public User Register(@RequestBody User user) {
		return authService.register(user);

	}

	@PostMapping("/login")
	public User login(@RequestBody User user) {
		return authService.login(user);

	}
}
