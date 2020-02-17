package br.com.project.wssipagacquirer.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COMMERCE")
public class CommerceEntity {
	
	private Integer id;
	private String nameCommerce;
	private String email;
	private Integer cnpj;
	private Integer fone;
	private Integer zipCode;
	private String  street;
	private String  district;
	private String  city;
	private String  state;
	private Integer number;
	private String  complement;
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "NAME_COMMERCE", nullable = false)
	public String getNameCommerce() {
		return nameCommerce;
	}
	public void setNameCommerce(String nameCommerce) {
		this.nameCommerce = nameCommerce;
	}
	
	@Column(name = "EMAIL", nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "CNPJ", nullable = false)
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	
	@Column(name = "FONE", nullable = false)
	public Integer getFone() {
		return fone;
	}
	public void setFone(Integer fone) {
		this.fone = fone;
	}
	public Integer getZipCode() {
		return zipCode;
	}
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	
	
		
}
