package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addSubject("국어",100);
		studentLee.addSubject("수학",50);
		
		Student studentSon = new Student(1002,"Son");
		studentLee.addSubject("국어",100);
		studentLee.addSubject("수학",20);
		studentLee.addSubject("양",90);
		
		studentLee.showStudentInfo();
		System.out.println("=================");
		studentSon.showStudentInfo();
	}


}
