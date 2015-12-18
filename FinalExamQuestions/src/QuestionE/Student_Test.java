package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Smith", "James", "Bert", dBirthDate, "215 Rose Lane", "302-384-9203", "jsmith@udel.edu","MIS");
		Student stu3 = new Student("Morris", "Robert", "James", dBirthDate, "134 Labrador Lane", "302-893-3382", "robmorris@udel.edu","MIS");
		Student stu4 = new Student("Tony", "Randall", "Jones", dBirthDate, "273 Delaware Lane", "302-384-6889", "jones@udel.edu","MIS");
		Student stu5 = new Student("Henry", "James", "Evans", dBirthDate, "273 Yellow Lane", "302-893-8293", "evans@udel.edu","MIS");
		
		Map<Student.getPersonID(), Student.getLastName()> hashMap = new HashMap<>();
		hashMap.put("Gibbons", stu1.getPersonID());
		hashMap.put("Bert", stu2.getPersonID());
		hashMap.put("James",stu3.getPersonID());
		hashMap.put("Jones",stu4.getPersonID());
		hashMap.put("Evans",stu5.getPersonID());
		
		
		assertTrue(hashMap.size==5);
	}

}
