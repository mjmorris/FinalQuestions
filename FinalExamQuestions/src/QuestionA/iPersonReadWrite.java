package QuestionA;

import java.util.Date;

public interface iPersonReadWrite implements Person {
	
	public Date DOB;
	public String FirstName;
	public String MiddleName;
	public String LastName;
	public String address;
	public String phone_number;
	public String email_address;
	
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}
	
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	public void setPhone(String newPhone_number) {
		phone_number = newPhone_number;
	}
	
	public void setEmail(String newEmail) {
		email_address = newEmail;
	}

}
