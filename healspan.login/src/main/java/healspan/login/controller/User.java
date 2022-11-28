package healspan.login.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "User_Master", schema = "Healspan")
public class User {
	@Id
	@Column(name = "um_id", unique = true)
	private Long id;
	@Column(name = "um_password", unique = true)
	private String password;

	@Column(name = "um_utm_id", unique = true)
	private Long userTypeMasterId;

	@Column(name = "um_hm_id", unique = true)
	private Long hospitalMasterId;

	@Column(name = "um_email", unique = true)
	private String emailAddress;

	@Column(name = "um_username", unique = true)
	private String username;

	@Column(name = "um_firstname", unique = true)
	private String firstname;

	@Column(name = "um_lastname", unique = true)
	private String lastname;

	@Column(name = "um_mobile_no", unique = true)
	private Long mobileNo;

	@Column(name = "um_is_active", unique = true)
	private boolean isActive;

	@Column(name = "um_created_by", unique = true)
	private Long createdBy;

	@Column(name = "um_created_datetime", unique = true)
	private Date createdDatetime;

	@Column(name = "um_modified_by", unique = true)
	private Long modifiedBy;

	@Column(name = "um_modified_datetime", unique = true)
	private Date modifiedDatetime;


	public User() {
	}

	public User(Long id, String password) {
		this.id = id;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

 	public String getPassword() {
		return password;
	}

	public Long getUserTypeMasterId() {
		return userTypeMasterId;
	}

	public void setUserTypeMasterId(Long userTypeMasterId) {
		this.userTypeMasterId = userTypeMasterId;
	}

	public Long getHospitalMasterId() {
		return hospitalMasterId;
	}

	public void setHospitalMasterId(Long hospitalMasterId) {
		this.hospitalMasterId = hospitalMasterId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDatetime() {
		return modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", password='" + password + '\'' +
				", userTypeMasterId=" + userTypeMasterId +
				", hospitalMasterId=" + hospitalMasterId +
				", emailAddress='" + emailAddress + '\'' +
				", username='" + username + '\'' +
				", firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", mobileNo=" + mobileNo +
				", isActive=" + isActive +
				", createdBy=" + createdBy +
				", createdDatetime=" + createdDatetime +
				", modifiedBy=" + modifiedBy +
				", modifiedDatetime=" + modifiedDatetime +
				'}';
	}
}
