package ExerciseSession7;

import java.time.LocalDateTime;

public class Teacher extends Employee {
	protected String officeHourse;
	protected String academicPosition;
	
	public Teacher(String name, 
					String address, 
					String phoneNumber, 
					String emailAddress, 
					String office, 
					Double salary, 
					LocalDateTime recruitmentDate, 
					String officeHourse, 
					String academicPosition) {
		super(name, address, phoneNumber, emailAddress, office, salary, recruitmentDate);
		this.officeHourse = officeHourse;
		this.academicPosition = academicPosition;
	}
}
