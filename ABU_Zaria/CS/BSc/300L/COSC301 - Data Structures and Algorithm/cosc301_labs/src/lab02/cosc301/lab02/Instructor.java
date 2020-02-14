package lab02.cosc301.lab02;

public class Instructor implements Comparable{
	private int id;
	private String department;
	
	public Instructor(int id, String department){
		this.id = id;
		this.department = department;
	}
	
	public int getID(){
	  return id;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public int compareTo(Object object){
		Instructor instructor = (Instructor)object;
		if(id == instructor.id)
		  return 0;
		else if(id > instructor.id)
		  return 1;
		else
		  return -1;
	}
	
	public String toString(){
		return "{ID#: " + id + ", Department: " + department + " }";
	}	
}
				