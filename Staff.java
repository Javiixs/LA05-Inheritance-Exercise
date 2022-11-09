package ExerciseSession7;

import java.time.LocalDateTime;

public class Staff extends Employee {
	public  Staff(String name, 
			String address, 
			String phoneNumber, 
			String emailAddress, 
			String office, 
			Double salary, 
			LocalDateTime recruitmentDate) {
		super(name, address, phoneNumber, emailAddress, office, salary, recruitmentDate);
	}
	
	@Override
	public String toString() {
	    return String.format("Class: %s, Name: %s", this.getClass().getSimpleName(), this.name);
	}
}
