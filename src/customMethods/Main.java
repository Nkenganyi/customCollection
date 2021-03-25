package customMethods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queueable<Student> dd = new JtQueue<>();
		
		dd.add(new Student("Nkenganyi", "ken@gmail.com"));
		dd.add(new Student("Sampson", "sam@gmail.com"));
		dd.add(new Student("Acha", "ache@gmail.com"));
		dd.add(new Student("Oben", "oben@gmail.com"));
		
		
		
		Student s = dd.remove(3);
	
		int count =0;
		for(int a = 0; a < dd.size(); a++) {
			++count;
			System.out.println(count + " " + dd.get(a));
		}
		
		
		
	}

}
