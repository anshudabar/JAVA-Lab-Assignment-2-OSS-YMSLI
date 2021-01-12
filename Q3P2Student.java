package Assignment2;

public class Q3P2Student {
	private String name,id;
	private double grade = -1;
	
	public Q3P2Student(String id) {
		this.id = id;
	}
	
	public Q3P2Student(String name, String id) {
		this(id);
		this.name = name;
	}
	
	public Q3P2Student(String name, String id, double grade) {
		this(name,id);
		this.grade = grade;
	}
		
	public Q3P2Student() {

	}

	public void display() {
		if(name!=null)
			System.out.println(this.name);
		
		if(id!=null)
			System.out.println(this.id);
		
		if(grade!=-1)
			System.out.println(this.grade);
	}
	
	public void display(int year) {
		this.display();
		System.out.println("The year of result is "+year);
	}	
	
}
