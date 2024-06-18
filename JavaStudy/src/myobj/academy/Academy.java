package myobj.academy;

import java.util.Arrays;

public class Academy {
	Student[] students = new Student[100];
	
	
	public Academy() {
		this.students = getStudents();
	}
	
	Student[] getStudents() {
		for (int i = 0; i < students.length; ++i) {
			students[i] = new Student(i + 1);
		}
		return students;
	}
	
	public double calcAvg () {
		double total = 0.0;
		int numSubject = 0;
		for (int i = 0; i < students.length; ++i) {
			numSubject = students[i].scores.length;
			total += students[i].scores[i];
		}
		return total / numSubject;
	}
	
	public static void main(String[] args) {
		
		Academy a1 = new Academy();
		
		for (int i = 0; i < a1.students.length; ++i) {
			a1.students[i].showInfo();
		}
		
	}
}
