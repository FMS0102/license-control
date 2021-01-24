package com.fms.license_control.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fms.license_control.entities.enums.Supply;

@Entity
@Table(name = "tb_provider")
public class Provider implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long cnpj;
	private String email;
	private Long number;
	private Supply supply;

	@ManyToMany
	@JoinTable(name = "tb_provider_activity", joinColumns = @JoinColumn(name = "provider_id"), inverseJoinColumns = @JoinColumn(name = "critical_activity_id"))
	private Set<CriticalActivity> activities = new HashSet<>();

	public Provider() {
	}

	public Provider(Long id, String name, Long cnpj, String email, Long number, Supply supply,
			Set<CriticalActivity> activities) {
		super();
		this.id = id;
		this.name = name;
		this.cnpj = cnpj;
		this.email = email;
		this.number = number;
		this.supply = supply;
		this.activities = activities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Supply getSupply() {
		return supply;
	}

	public void setSupply(Supply supply) {
		this.supply = supply;
	}

	public Set<CriticalActivity> getActivities() {
		return activities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provider other = (Provider) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
