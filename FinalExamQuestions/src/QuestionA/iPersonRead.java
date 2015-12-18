package QuestionA;

import java.util.Date;

public interface iPersonRead implements Person {
	
	public Date DOB;
	public String FirstName;
	public String MiddleName;
	public String LastName;
	public String address;
	public String phone_number;
	public String email_address;

	public String getFirstName() {
		return FirstName;
	}
	
	public String getMiddleName() {
		return MiddleName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public Date getDOB() {
		return DOB;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return phone_number;
	}
	
	public String getEmail() {
		return email_address;
	}

}
