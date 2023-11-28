package com.example.employeeservice.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDto {
    private Long id;
    private  String organizationName;
    private String organizationDescription;
    private String organizationCode;
    private String getOrganizationCreatedDate;
    public OrganizationDto() {}
	public OrganizationDto(Long id, String organizationName, String organizationDescription, String organizationCode,
			String getOrganizationCreatedDate) {
		super();
		this.id = id;
		this.organizationName = organizationName;
		this.organizationDescription = organizationDescription;
		this.organizationCode = organizationCode;
		this.getOrganizationCreatedDate = getOrganizationCreatedDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getOrganizationDescription() {
		return organizationDescription;
	}
	public void setOrganizationDescription(String organizationDescription) {
		this.organizationDescription = organizationDescription;
	}
	public String getOrganizationCode() {
		return organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}
	public String getGetOrganizationCreatedDate() {
		return getOrganizationCreatedDate;
	}
	public void setGetOrganizationCreatedDate(String getOrganizationCreatedDate) {
		this.getOrganizationCreatedDate = getOrganizationCreatedDate;
	}
    
   
}
