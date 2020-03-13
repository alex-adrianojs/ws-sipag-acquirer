package br.com.project.wssipagacquirer.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "COMMERCE")
public class CommerceEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nameCommerce;
	private Integer cnpj;
	
	@ElementCollection
	@CollectionTable(name = "commerce_fones", joinColumns = @JoinColumn(name="cod_commerce"))
	@Column(name = "fones", length = 20)
	private List<String> fones;
	
	@ElementCollection
	@CollectionTable(name = "commerce_email", joinColumns = @JoinColumn(name = "cod_commerce"))
	private List<String> email;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "id_adress")
	private AdressEntity adress;
	
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
	public AdressEntity getAdress() {
		return adress;
	}
	public void setAdress(AdressEntity adress) {
		this.adress = adress;
	}

	

	
	
	
	
		

	
	
		
}
