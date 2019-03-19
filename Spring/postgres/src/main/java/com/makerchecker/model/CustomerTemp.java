package com.makerchecker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "customer_temp")
public class CustomerTemp extends AuditModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(updatable = false, nullable = false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "cust_id_generator")
	@SequenceGenerator(name="cust_id_generator", sequenceName = "cust_id_generator",allocationSize=1)
	private Long customer_id;
	
	
	@Column
	private String customer_code;
	
	@Column
	private String customer_name;
	
	@Column
	private String customer_address1;
	
	@Column
	private String customer_address2;
	

	@Column
	private int customer_pincode;
	
	@Column
	private String email;
	
	@Column
	private long contact_number;
	
	@Column
	private String primary_contact_person;
	
	@Column
	private String record_status;
	
	@Column
	private String is_enabled;
	
	@Column
	@JsonIgnore
	private String created_by;
	
	@Column
	@JsonIgnore
	private String modified_by;
	
	@Column 
	@JsonIgnore
	private String authorized_by;
	
	
	
	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_code() {
		return customer_code;
	}

	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_address1() {
		return customer_address1;
	}

	public void setCustomer_address1(String customer_address1) {
		this.customer_address1 = customer_address1;
	}
	public String getCustomer_address2() {
		return customer_address2;
	}

	public void setCustomer_address2(String customer_address2) {
		this.customer_address2 = customer_address2;
	}

	public int getCustomer_pincode() {
		return customer_pincode;
	}

	public void setCustomer_pincode(int customer_pincode) {
		this.customer_pincode = customer_pincode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact_number() {
		return contact_number;
	}

	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}

	public String getPrimary_contact_person() {
		return primary_contact_person;
	}

	public void setPrimary_contact_person(String primary_contact_person) {
		this.primary_contact_person = primary_contact_person;
	}

	public String getRecord_status() {
		return record_status;
	}

	public void setRecord_status(String record_status) {
		this.record_status = record_status;
	}

	public String getIs_enabled() {
		return is_enabled;
	}

	public void setIs_enabled(String is_enabled) {
		this.is_enabled = is_enabled;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public String getAuthorized_by() {
		return authorized_by;
	}

	public void setAuthorized_by(String authorized_by) {
		this.authorized_by = authorized_by;
	}
}
