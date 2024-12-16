package com.nit.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "invoice_db")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invoice_seq")
	@SequenceGenerator(name = "invoice_seq", sequenceName = "invoice_seq", allocationSize = 1)
	@Id
	private Long id;
	private String name;
	private String location;
	private Double amount;
	

	
	

}
