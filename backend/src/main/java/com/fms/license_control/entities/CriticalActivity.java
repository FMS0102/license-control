package com.fms.license_control.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fms.license_control.entities.enums.CriticalType;

@Entity
@Table(name = "tb_critical_activity")
public class CriticalActivity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String activityName;
	private CriticalType criticalType;

	@ManyToMany
	@JoinTable(name = "tb_activity_license", joinColumns = @JoinColumn(name = "critical_activity_id"), inverseJoinColumns = @JoinColumn(name = "license_id"))
	private List<License> licenses = new ArrayList<>();

	public CriticalActivity() {
	}

	public CriticalActivity(Long id, String activityName, CriticalType criticalType) {
		super();
		this.id = id;
		this.activityName = activityName;
		this.criticalType = criticalType;
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

	public List<License> getLicenses() {
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
		CriticalActivity other = (CriticalActivity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
