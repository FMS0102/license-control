package com.fms.license_control.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fms.license_control.entities.Provider;
import com.fms.license_control.entities.enums.Supply;

public class ProviderDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Long cnpj;
	private String email;
	private Long number;
	private Supply supply;

	private List<CriticalActivityDTO> activities = new ArrayList<>();

	public ProviderDTO() {
	}

	public ProviderDTO(Long id, String name, Long cnpj, String email, Long number, Supply supply) {
		this.id = id;
		this.name = name;
		this.cnpj = cnpj;
		this.email = email;
		this.number = number;
		this.supply = supply;
	}

	public ProviderDTO(Provider entity) {
		id = entity.getId();
		name = entity.getName();
		cnpj = entity.getCnpj();
		email = entity.getEmail();
		number = entity.getNumber();
		supply = entity.getSupply();
		activities = entity.getActivities().stream().map(x -> new CriticalActivityDTO(x)).collect(Collectors.toList());
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

	public List<CriticalActivityDTO> getLicenses() {
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
		ProviderDTO other = (ProviderDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
