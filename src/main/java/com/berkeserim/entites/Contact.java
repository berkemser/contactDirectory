package com.berkeserim.entites;



import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contact")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "phone_number", nullable = false, length = 20)
    private String phoneNumber;
	
	@Column(name = "phone_number1", nullable = true ,length = 20)
	private String phoneNumber1;
	
	@Column(name = "first_name", nullable = false , length = 30)
	private String firstName;
	
	@Column(name = "last_name", nullable = true , length = 30)
	private String lastName;
	
	@Column(name = "address_home1", nullable = true , length = 30)
	private String addressHome1;
	
	@Column(name = "address_home2", nullable = true , length = 300)
	private String addressHome2;
	
	@Column(name = "mail1", nullable = true, length = 300)
	private String mail1;
	
	@Column(name = "mail2", nullable = true , length = 30)
	private String mail2;
	
	@Column(name = "company", nullable = true , length = 30)
	private String company;
	
	@Column(name = "company_address", nullable = true , length = 30)
	private String companyAddress;
	
	@Column(name = "label", nullable = true , length = 100)
	private String label;
	
	@Column(name = "notes", nullable = true, length = 500)
    private String notes;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth_date", nullable = true)
    private Date birthDate;

}
