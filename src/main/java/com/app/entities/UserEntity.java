package com.app.entities;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity // mandatory class level annotation for hibernate , to specify
//following class represents DB entity
@Table(name = "users") // to specify name of the table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true, exclude = { "password"})

public class UserEntity extends BaseEntity {

	@Column(length = 20) // column name , varchar(20)
	private String firstName;
	@Column(length = 20) // column name , varchar(20)
	private String lastName;
	@Column(length = 25, unique = true) // adds unique constraint
	private String email;
	@Column(length = 500, nullable = false) // not null constraint
	private String password;
	private LocalDate dob;
	@Column
	private double regAmount;
	@Enumerated(EnumType.STRING) // create column of type
	// varchar to store the name of constant
	@Column(length = 30) // varchar(30)
	private UserRole role;
	
}
