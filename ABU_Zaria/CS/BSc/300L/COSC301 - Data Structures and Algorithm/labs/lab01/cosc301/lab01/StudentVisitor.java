package lab01.cosc301.lab01;

import lab01.cosc301.*;

public class StudentVisitor extends AbstractVisitor {
	
	public void visit(Object object) {
		Student student = (Student) object;
		double totalGrade = 0;
		totalGrade += student.getExam1Grade() + student.getExam2Grade()+ student.getFinalExamGrade();
		double[] qzGrade = student.getQuizGrades();
		for(int k = 0; k < qzGrade.length; k++)
		  totalGrade += qzGrade[k];
		  
		student.setTotalGrade(totalGrade);
	}
}
				