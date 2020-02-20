package lab02.cosc301.lab02;

import lab02.cosc301.Association;

public class TestLabelProject01{
   public static void main(String[] args){
	  LabelledContainer section1 = new LabelledContainer("01");
	  LabelledContainer section2 = new LabelledContainer("02");
	  LabelledContainer section51 = new LabelledContainer("51");
	  LabelledContainer section52 = new LabelledContainer("52");
	  
	  // section1 container is filled with section1 students
      section1.insert(new Student(230001, "01", "52", "COE"));
      section1.insert(new Student(230002, "01", "51", "ICS"));
      section1.insert(new Student(230003, "01", "52", "ICS"));
      section1.insert(new Student(230004, "01", "51", "COE"));
		
	  // section51 container is filled with section51 students
      section51.insert(new Student(230002, "01", "51", "ICS"));
	  section51.insert(new Student(230004, "01", "51", "COE"));
      section51.insert(new Student(230007, "02", "51", "ICS"));
	  section51.insert(new Student(230008, "02", "51", "COE"));
	  section51.insert(new Student(230009, "02", "51", "COE"));
		
	  // section2 container is filled with section2 students
      section2.insert(new Student(230005, "02", "52", "COE"));
      section2.insert(new Student(230006, "02", "52", "ICS"));
      section2.insert(new Student(230007, "02", "51", "ICS"));
      section2.insert(new Student(230008, "02", "51", "COE"));
	  section2.insert(new Student(230009, "02", "51", "COE"));

	  // section52 container is filled with section52 students
      section52.insert(new Student(230001, "01", "52", "COE"));
      section52.insert(new Student(230003, "01", "52", "ICS"));
      section52.insert(new Student(230005, "02", "52", "COE"));
	  section52.insert(new Student(230006, "02", "52", "ICS"));
	  
	 // Create Course container
	 MySearchableContainer cosc301Container = new MySearchableContainer();
	  
	 // Create Instructor objects
	 Instructor instructor1 = new Instructor(6940501, "ICS");
	 Instructor instructor2 = new Instructor(6940502, "ICS");
	
	// Create sectionsContainer for each instructor			
    MySearchableContainer instructor1Sections = new MySearchableContainer();
	MySearchableContainer instructor2Sections = new MySearchableContainer();
	
    // Insert section containers in instructor1Sections container
	instructor1Sections.insert(section1);
	instructor1Sections.insert(section51);

     //create an association between instructor1 and his sections
     Association instructor1SectionAssociation =
         new Association(instructor1, instructor1Sections);

    // Insert section containers in instructor2Sections container
	instructor2Sections.insert(section2);
	instructor2Sections.insert(section52);

    //create an association between instructor2 and his sections
    Association instructor2SectionAssociation =
         new Association(instructor2, instructor2Sections);
		
	// insert the two association objects in the course container	
	cosc301Container.insert(instructor1SectionAssociation);
	cosc301Container.insert(instructor2SectionAssociation);
	  
	  // ... To be completed by students

	  }
 }	  