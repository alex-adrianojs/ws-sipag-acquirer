package br.com.project.wssipagacquirer.dto;

import java.util.List;

public class CommerceDto {
	
	private Integer 		id;
	private String 			nameCommerce;
	private Integer 		cnpj;
	private List<String> 	fones; 
	private List<String> 	email;
	private AdressDto 		adress;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNameCommerce() {
		return nameCommerce;
	}
	public void setNameCommerce(String nameCommerce) {
		this.nameCommerce = nameCommerce;
	}
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public List<String> getFones() {
		return fones;
	}
	public void setFones(List<String> fones) {
		this.fones = fones;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	public AdressDto getAdress() {
		return adress;
	}
	public void setAdress(AdressDto adress) {
		this.adress = adress;
	}
	


	
	

}
