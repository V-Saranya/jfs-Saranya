package com.makerchecker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer_master")
public class CustomerMaster extends AuditModel {
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customer_id;
	
	@Id
	@Column
	private String customer_code;
	
	@Column
	private String customer_name;
	@Column
	private String customer_address1;
	
	@Column
	private int customer_pincode;
	
	@Column
	private String email;
	
	@Column
	private int contact_number;
	
	@Column
	private String primary_contact_person;
	
	@Column
	private String record_status;
	
	@Column
	private String is_enabled;

	@Column
	private String created_by;
	
	@Column 
	private String modified_by;
	
	@Column 
	private String authorized_by;
	
	
	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
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

	public int getContact_number() {
		return contact_number;
	}

	public void setContact_number(int contact_number) {
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
