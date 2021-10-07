package Java2;

import java.util.HashMap;

class Student{
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id; this.tel = tel;
	}
}
public class HashMapStudentEx {

	public static void main(String[] args) {

		HashMap<String,Student> map = new HashMap<>();
		
		map.put("황기태", new Student(1,"010-111-1111"));
		map.put("이재문", new Student(2,"010-211-1111"));
		map.put("김남윤", new Student(3,"010-311-1111"));
		
	Scanner scanner = new Scanner(System.in);
	while(true) {
		System.out.println("검색할 이름?");
		String name = scanner.nextLine();
		if(name == "exit")
			break;
		Student student = map.get(name);
		if(student == null)
			System.out.println(name + "은 없는 사람입니다.");
		else
			System.out.println("id" + student.id +"전화" +  )
	}
	}

}
