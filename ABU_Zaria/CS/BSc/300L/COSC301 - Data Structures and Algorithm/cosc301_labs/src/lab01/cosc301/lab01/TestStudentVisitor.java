package lab01.cosc301.lab01;

public class TestStudentVisitor {
	
	public static void main(String[] args) {
		MyContainer c = new MyContainer();
		double[] student1qz = {2, 2, 3, 3, 5, 5, 5, 5}; 
		double[] student2qz = {1, 2, 3, 3, 4, 5, 3, 5}; 
		double[] student3qz = {1, 1, 3, 3, 3, 2, 5, 4}; 
		Student student1 = new Student(230001, 20, 20, 20,student1qz );
		Student student2 = new Student(230002, 15, 17, 12,student2qz);
		Student student3 = new Student(230003, 20, 16, 18, student3qz);
		c.insert(student1);
		c.insert(student2);
		c.insert(student3);
		
		StudentVisitor visitor = new StudentVisitor();
		c.accept(visitor);
	   System.out.println(c);
	}
}
				