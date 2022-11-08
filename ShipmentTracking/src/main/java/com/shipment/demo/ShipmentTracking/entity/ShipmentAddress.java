package com.shipment.demo.ShipmentTracking.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class ShipmentAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "trackingnumber", referencedColumnName = "dateMob")

	//private FromAddress trackingnumber;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String date;

	@Column(name = "mobile_no")
	private String mobileNo;

	@Column(name = "description")
	private String description;

	@Column(name = "address_1")
	private String address_1;

	@Column(name = "address_2")
	private String address_2;

	@Column(name = "city")
	private String city;

	@Column(name = "zip_code")
	private int zip_code;

	public ShipmentAddress(Integer id, String firstName, String middleName, String lastName,
			String date, String mobileNo, String description, String address_1, String address_2, String city,
			int zip_code) {
		super();
		this.id = id;
//		this.trackingnumber = trackingnumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.date = date;
		this.mobileNo = mobileNo;
		this.description = description;
		this.address_1 = address_1;
		this.address_2 = address_2;
		this.city = city;
		this.zip_code = zip_code;
	}

	public ShipmentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public FromAddress getTrackingnumber() {
//		return trackingnumber;
//	}
//
//	public void setTrackingnumber(FromAddress trackingnumber) {
//		this.trackingnumber = trackingnumber;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress_1() {
		return address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}

	public String getAddress_2() {
		return address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	@Override
	public String toString() {
		return "ShipmentAddress [id=" + id  + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", date=" + date + ", mobileNo=" + mobileNo
				+ ", description=" + description + ", address_1=" + address_1 + ", address_2=" + address_2 + ", city="
				+ city + ", zip_code=" + zip_code + "]";
	}
	
}
