package com.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Amazon {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String cname;
	private String	pname;
	private Double price;
	private Double quantity;
	private Double total;
	private Double disc;
	private Double invoicebill;

}
