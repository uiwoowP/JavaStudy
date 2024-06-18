
public class P05_Person {
	int age;
	String name;
	boolean isMarried;
	int kids;
	
	public String getName() {
		return name;
	}
	
	public void setName(String sName) {
		name = sName;
	}
	
	public static void main(String[] args) {
		
		P05_Person warFrame1 = new P05_Person();
		warFrame1.setName("네크로스");
		
		System.out.print(warFrame1.name);
		
	}
	

}
