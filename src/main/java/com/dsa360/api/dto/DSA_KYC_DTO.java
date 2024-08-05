package com.dsa360.api.dto;
/*
 * 
 * Author :- Abhay
 * 
 * */
import org.springframework.web.multipart.MultipartFile;

import com.dsa360.api.constants.ApprovalStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DSA_KYC_DTO {

	private String dsaKycId;

	private String dsaRegistrationId;
	private String bankName;
	private String accountNumber;
	private String ifscCode;

	private String approvalStatus = ApprovalStatus.PENDING.getValue();

	private MultipartFile passportFile;
	private MultipartFile drivingLicenceFile;
	private MultipartFile aadharCardFile;
	private MultipartFile panCardFile;
	private MultipartFile photographFile;
	private MultipartFile addressProofFile;
	private MultipartFile bankPassbookFile;
	public String getDsaKycId() {
		return dsaKycId;
	}
	public void setDsaKycId(String dsaKycId) {
		this.dsaKycId = dsaKycId;
	}
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
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public MultipartFile getPassportFile() {
		return passportFile;
	}
	public void setPassportFile(MultipartFile passportFile) {
		this.passportFile = passportFile;
	}
	public MultipartFile getDrivingLicenceFile() {
		return drivingLicenceFile;
	}
	public void setDrivingLicenceFile(MultipartFile drivingLicenceFile) {
		this.drivingLicenceFile = drivingLicenceFile;
	}
	public MultipartFile getAadharCardFile() {
		return aadharCardFile;
	}
	public void setAadharCardFile(MultipartFile aadharCardFile) {
		this.aadharCardFile = aadharCardFile;
	}
	public MultipartFile getPanCardFile() {
		return panCardFile;
	}
	public void setPanCardFile(MultipartFile panCardFile) {
		this.panCardFile = panCardFile;
	}
	public MultipartFile getPhotographFile() {
		return photographFile;
	}
	public void setPhotographFile(MultipartFile photographFile) {
		this.photographFile = photographFile;
	}
	public MultipartFile getAddressProofFile() {
		return addressProofFile;
	}
	public void setAddressProofFile(MultipartFile addressProofFile) {
		this.addressProofFile = addressProofFile;
	}
	public MultipartFile getBankPassbookFile() {
		return bankPassbookFile;
	}
	public void setBankPassbookFile(MultipartFile bankPassbookFile) {
		this.bankPassbookFile = bankPassbookFile;
	}

	
	
}
