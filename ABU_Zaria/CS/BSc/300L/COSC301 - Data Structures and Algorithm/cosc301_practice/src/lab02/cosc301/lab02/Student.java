package lab02.cosc301.lab02;

public class Student implements Comparable{
	private int id;
	private String lectureSection;
	private String labSection;
	private String major;
	
	public Student(int id, String lectureSection, String labSection, String major){
		this.id = id;
		this.lectureSection = lectureSection;
		this.labSection = labSection;
		this.major = major;
	}
	
	public Student(int id){
	   this(id, "0", "0", "");
	}
	
	public int getID(){
		return id;
	}
	
	public String getLectureSection(){
		return lectureSection;
	}
	
	public String getLabSection(){
		return labSection;
	}
	
	public void setLectureSection(String newLectureSection){
		lectureSection = newLectureSection;
	}
	
	public void setLabSection(String newLabSection){
		labSection = newLabSection;
	}
	
	public String getMajor(){
		return major;
	}
	
	public int compareTo(Object object){
		Student student = (Student)object;
		if(id == student.id)
		  return 0;
		else if(id > student.id)
		  return 1;
		else
		  return -1;
	}
	
	public boolean equals(Object obj){
	  Student student = (Student)obj;
	  return compareTo(student) == 0;
	  }
	
	public String toString(){
		return "{ID#: " + id + ", LectureSection#: " + lectureSection + ", LabSection#: " + labSection +", Major: " + major + " }";
	}	
}
				