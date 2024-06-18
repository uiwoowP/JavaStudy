package myobj.peach;

public class Peach implements Comparable<Peach> {
	int price;
	String grade;
	int weight;
	String farm;
	int numGrade;
	
	public Peach(int price, String grade, int weight, String farm) {
		this.price = price;
		this.grade = grade;
		this.weight = weight;
		this.farm = farm;
	}
	
	@Override
	public String toString() {
		return String.format("%s//등급 %s//무게 %d//가격 %d\n",
				this.farm, this.grade, this.weight, this.price);
	}
	
	@Override
	public int compareTo(Peach p) {
		return this.weight - p.weight;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	public void assignNum(String grade) {
	
		switch (grade) {
		case "A+" : this.numGrade = 12; break;
		case "A"  : this.numGrade = 11; break;
		case "A-" : this.numGrade = 10; break;
		case "B+" : this.numGrade = 9; break;
		case "B"  : this.numGrade = 8; break;
		case "B-" : this.numGrade = 7; break;
		case "C+" : this.numGrade = 6; break;
		case "C"  : this.numGrade = 5; break;
		case "C-" : this.numGrade = 4; break;
		case "D+" : this.numGrade = 3; break;
		case "D"  : this.numGrade = 2; break;
		case "D-" : this.numGrade = 1; break;
		case "F"  : this.numGrade = 0; break;
		}
	}
}
