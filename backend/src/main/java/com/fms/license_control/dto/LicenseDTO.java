package com.fms.license_control.dto;

import java.io.Serializable;
import java.util.Date;

import com.fms.license_control.entities.License;
import com.fms.license_control.entities.enums.LicenseStatus;

public class LicenseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String licenseName;
	private Date issueDate;
	private Date dueDate;
	private LicenseStatus licenseStatus;

	public LicenseDTO() {
	}

	public LicenseDTO(Long id, String licenseName, Date issueDate, Date dueDate, LicenseStatus licenseStatus) {
		this.id = id;
		this.licenseName = licenseName;
		this.issueDate = issueDate;
		this.dueDate = dueDate;
		this.licenseStatus = licenseStatus;
	}

	public LicenseDTO(License entity) {
		id = entity.getId();
		licenseName = entity.getLicenseName();
		issueDate = entity.getIssueDate();
		dueDate = entity.getDueDate();
		licenseStatus = entity.getLicenseStatus();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLicenseName() {
		return licenseName;
	}

	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public LicenseStatus getLicenseStatus() {
		return licenseStatus;
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
		LicenseDTO other = (LicenseDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
