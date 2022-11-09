package ExerciseSession7;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		Staff staff1 = new Staff("Bob", 
								"Jakarta", 
								"081377710109", 
								"bob.ross@binus.ac.id", 
								"BINUS University Kemanggisan", 
								2500.0, 
								LocalDateTime.now());
		System.out.println(staff1.toString());
	}
}
