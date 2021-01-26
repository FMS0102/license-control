package com.fms.license_control.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fms.license_control.entities.CriticalActivity;
import com.fms.license_control.entities.enums.CriticalType;

public class CriticalActivityDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String activityName;
	private CriticalType criticalType;

	private List<LicenseDTO> licenses = new ArrayList<>();

	public CriticalActivityDTO() {
	}

	public CriticalActivityDTO(Long id, String activityName, CriticalType criticalType) {
		this.id = id;
		this.activityName = activityName;
		this.criticalType = criticalType;
	}

	public CriticalActivityDTO(CriticalActivity entity) {
		id = entity.getId();
		activityName = entity.getActivityName();
		criticalType = entity.getCriticalType();
		licenses = entity.getLicenses().stream().map(x -> new LicenseDTO(x)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public CriticalType getCriticalType() {
		return criticalType;
	}

	public void setCriticalType(CriticalType criticalType) {
		this.criticalType = criticalType;
	}

	public List<LicenseDTO> getLicenses() {
		return licenses;
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
		CriticalActivityDTO other = (CriticalActivityDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
