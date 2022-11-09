package ExerciseSession7;

import java.time.LocalDateTime;

public class Employee extends Persona {
	protected String office;
	protected Double salary;
	protected LocalDateTime recruitmentDate;
	
	public Employee(String name, 
					String address, 
					String phoneNumber, 
					String emailAddress, 
					String office, 
					Double salary, 
					LocalDateTime recruitmentDate) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.recruitmentDate = recruitmentDate;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDateTime getRecruitmentDate() {
		return recruitmentDate;
	}

	public void setRecruitmentDate(LocalDateTime recruitmentDate) {
		this.recruitmentDate = recruitmentDate;
	}
}