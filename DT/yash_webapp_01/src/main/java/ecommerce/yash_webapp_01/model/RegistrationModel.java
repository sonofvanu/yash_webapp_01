package ecommerce.yash_webapp_01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table
public class RegistrationModel {

	@Id
	@Column(name = "RegId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int RegId;
	@NotEmpty 
	String RegName;
	@NotEmpty @Email
	String RegEmail;
	@NotEmpty
	String RegPwd;
	@NotEmpty
	String RegGen;
	@NotEmpty
	String RegAddress;
	public int getRegId() {
		return RegId;
	}
	public void setRegId(int regId) {
		RegId = regId;
	}
	public String getRegName() {
		return RegName;
	}
	public void setRegName(String regName) {
		RegName = regName;
	}
	public String getRegEmail() {
		return RegEmail;
	}
	public void setRegEmail(String regEmail) {
		RegEmail = regEmail;
	}
	public String getRegPwd() {
		return RegPwd;
	}
	public void setRegPwd(String regPwd) {
		RegPwd = regPwd;
	}
	public String getRegGen() {
		return RegGen;
	}
	public void setRegGen(String regGen) {
		RegGen = regGen;
	}
	public String getRegAddress() {
		return RegAddress;
	}
	public void setRegAddress(String regAddress) {
		RegAddress = regAddress;
	}
	
}
