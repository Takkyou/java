package inheritance2;

public class Subject {
	
	private int subjectId;
	private int subjectName;
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public int getSubjecteName() {
		return subjectName;
	}
	public void setSubjecteName(int subjectName) {
		this.subjectName = subjectName;
	}
	public void showSubjectInfo() {
		System.out.println(subjectId + "," + subjectName);
	}
}
