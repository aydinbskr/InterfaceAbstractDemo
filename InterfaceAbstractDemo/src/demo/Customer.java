package demo;

import java.util.Date;

public class Customer implements Entity {
	int id;
	String FirstName;
	String LastName;
	String DateofBirth;
	String NationalId;
	public Customer(int id, String firstName, String lastName, String dateofBirth, String nationalId) {
		
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DateofBirth = dateofBirth;
		NationalId = nationalId;
	}
}
