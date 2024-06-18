package object;

public class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + "," + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if (this.studentId == std.studentId) {
				return true;
			}
			else return false;
		} return false;

	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
	
}