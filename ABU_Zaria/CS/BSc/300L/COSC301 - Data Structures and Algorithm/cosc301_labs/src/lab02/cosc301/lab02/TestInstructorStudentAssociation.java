package lab02.cosc301.lab02;

import lab01.cosc301.Iterator;
import lab01.cosc301.PrintingVisitor;
import lab02.cosc301.Association;

public class TestInstructorStudentAssociation{
   public static void main(String[] args){
      Instructor instructor1 = new Instructor(6940500, "ICS");
      Student student1 = new Student(230000, "4", "52", "COE");
      MySearchableContainer studentContainer = new MySearchableContainer ( );

      // studentContainer is filled with instructor1 students
      studentContainer.insert(new Student(230001, "3", "54", "COE"));
      studentContainer.insert(new Student(230002, "2", "51", "ICS"));
      studentContainer.insert(new Student(230003, "3", "51", "ICS"));
      studentContainer.insert(new Student(230004, "3", "52", "COE"));

      //create an association between instructor1 and his students
      Association instructor1StudentAssociation =
         new Association(instructor1, studentContainer);

      // How many students does instructor1 teach?
      MySearchableContainer c =  (MySearchableContainer) instructor1StudentAssociation.getValue( );
      System.out.println("Instructor " + instructor1 + " teaches " + c.getCount( ) + " students");

      // Does instructor1 teach student1?
      if(c.isMember(student1))
         System.out.println("Instructor " + instructor1 + " teaches Student " + student1);
      else
        System.out.println("Instructor " + instructor1 + " does not teach Student " + student1);

      // Display all instructor1 students using an iterator:
		System.out.println("The students taught by Instructor " + instructor1 + " are:\n");
      Iterator iterator = c.iterator( );
      while(iterator.hasNext( ))
         System.out.println((Student) iterator.next( ));
      
       
       System.out.println("=================================================");
       
      // Display all instructor1 students using a Printing visitor:
		System.out.println("The students taught by Instructor " + instructor1 + " are:\n");
      c.accept(new PrintingVisitor());

     // Add a new student to the container of students taught by instructor1

     Student student2 = new Student(230005, "3", "53", "ICS");
     if(c.isMember(student2))
       System.out.println("Error: " + instructor1 + " teaches " + student2);
     else
     	c.insert(student2);
       
     System.out.println("=================================================");
       
     // Display all instructor1 students by using toString method
	  System.out.println("The students taught by Instructor " + instructor1 + " are:\n");
     System.out.println((MySearchableContainer) instructor1StudentAssociation.getValue( ));
   }
}				