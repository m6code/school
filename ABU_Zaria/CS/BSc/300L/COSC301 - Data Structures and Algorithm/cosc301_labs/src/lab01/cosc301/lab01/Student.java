package lab01.cosc301.lab01;

import lab01.cosc301.*;

public class Student implements Comparable{
	private int id;
	private double exam1Grade,exam2Grade,finalExamGrade;
	private double totalGrade;
	private double[] qzGrade = new double[8];
	
	public Student(int id, double exm1, double exm2, double fnlExm, double[] qz){
		this.id = id;
		exam1Grade = exm1;
		exam2Grade = exm2;
		finalExamGrade = fnlExm;
		for(int k=0; k < qzGrade.length; k++)
		  qzGrade[k] = qz[k];
	}
	
	public int getID(){
		return id;
	}
	
	public double getExam1Grade(){
		return exam1Grade;
	}
	
	public double getExam2Grade(){
		return exam2Grade;
	}
	
	public double getFinalExamGrade(){
		return finalExamGrade;
	}
	
	public double[] getQuizGrades(){
	  return  qzGrade;
	}
	
	public void setTotalGrade(double grade){
	   totalGrade = grade;
	}

	public double getTotalGrade(){
		return totalGrade;
	}

	
	public int compareTo(Object object){
		Student student = (Student)object;
		return this.id - student.id;
	}
	
	public String toString(){
		return "{id: " + id + ",totalgrade: " +totalGrade + " }";
	}	
}
				