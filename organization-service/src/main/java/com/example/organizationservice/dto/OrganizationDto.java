package com.example.organizationservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.NamedEntityGraph;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Schema(
        description = "Organization_Dto Model info"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto {
    private Long id;

    @Schema(
            description = "Organization Name"
    )
    private  String organizationName;

    @Schema(
            description = "Organization Description"
    )
    private String organizationDescription;
    @Schema(
            description = "Organization Code"
    )
    private String organizationCode;
    @Schema(
            description = "Organization Created Date"
    )
    private String getOrganizationCreatedDate;


    public OrganizationDto() {
		super();
	}
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
