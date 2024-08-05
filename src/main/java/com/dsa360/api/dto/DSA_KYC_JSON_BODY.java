package com.dsa360.api.dto;
/*
 * 
 * Author :- Abhay
 * 
 * */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DSA_KYC_JSON_BODY {
    private String dsaRegistrationId;
    private String bankName;
    private String accountNumber;
    private String ifscCode;
	public String getDsaRegistrationId() {
		return dsaRegistrationId;
	}
	public void setDsaRegistrationId(String dsaRegistrationId) {
		this.dsaRegistrationId = dsaRegistrationId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
    

}
