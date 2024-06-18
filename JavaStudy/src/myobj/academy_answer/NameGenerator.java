package myobj.academy_answer;

public class NameGenerator {
	// 다른 클래스에서 쓸 필요가 없는 자원들을 private으로 숨겨놓는다
	private String[] lastNameCandidates = {"김", "이", "박", "최", "윤", "송"};
	private String[] firstNameCandidates = {"영", "철", "수", "지", "민", "춘", "공", "마", "혜", "봉", "효"};
	
	
	public void setLastNameCandidates(String... lastNames) {
		this.lastNameCandidates = lastNames;
	}
	
	public void setFirstNameCadidates(String... firstNameCandidates) {
		this.firstNameCandidates = firstNameCandidates;
	}
	
	public String generate() {
		return selectRandomOne(lastNameCandidates)
				+ selectRandomOne(firstNameCandidates)
				+ selectRandomOne(firstNameCandidates);
	}
	
	// 다른 클래스에서 쓸 필요가 없는 기능들을 private 으로 숨겨놓는다.
	private String selectRandomOne(String[] arr) {
		return arr[(int)(Math.random() * arr.length)];
	}

}
