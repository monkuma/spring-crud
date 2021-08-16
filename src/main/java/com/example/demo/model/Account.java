package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
public class Account {
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	@Size(max = 40)
	private String name;

	@NotBlank
	@Size(max = 40)
	private String kana;

	@NotBlank
	private String tel;

	@NotBlank
	private String address;
	
	public Account() {
		super();
	}
	
	public Account(String name, String kana, String tel, String address) {
		super();
		this.name = name;
		this.kana = kana;
		this.tel = tel;
		this.address = address;
	}
}
