package ExerciseSession7;

public class Student extends Persona {
	protected final String status;

	public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
