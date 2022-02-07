package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customer_id;
	private String customername;
	private String carname;
	private String salesperson;

	public Integer getCustomerid() {
		return customer_id;
	}

	public void setCustomerid(Integer customerid) {
		this.customer_id = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getSalesperson() {
		return salesperson;
	}

	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}

}
