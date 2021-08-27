package classpart;

public class StudentaTest {

	public static void main(String[] args) {
		Student studentAhn = new Student( );
		studentAhn.studentName = "탁경진";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName( ));
	}

}
