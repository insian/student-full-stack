package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer_table")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	@Column(name = "customer_id", unique=true)
	private String customerId;
	@Column(name = "first_name", nullable = true)
	private String firstName;
	@Column(name = "last_name", nullable = true)
	private String lastName;
	@Column(name = "email", nullable = true, unique = true)
	private String emailId;
	
}
