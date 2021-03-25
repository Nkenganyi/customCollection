package customMethods;

public class Student {
	public String name;
	public String email;
	
	public Student() {}
	
	public Student(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + "]";
	}
	
	
}
