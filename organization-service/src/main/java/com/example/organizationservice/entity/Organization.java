package com.example.organizationservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "organizations")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private  String organizationName;
    private String organizationDescription;
    @Column(nullable = false, unique = true)
    private String organizationCode;
    @CreationTimestamp
    private String getOrganizationCreatedDate;
    
    public Organization() {
		super();
	}
	public Organization(Long id, String organizationName, String organizationDescription, String organizationCode,
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