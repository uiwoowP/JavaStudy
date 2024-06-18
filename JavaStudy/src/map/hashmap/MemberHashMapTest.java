package map.hashmap;

import collection.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member member1 = new Member(1001, "뽀로로");
		Member member2 = new Member(1002, "루피");
		Member member3 = new Member(1003, "크롱");
		Member member4 = new Member(1004, "포비");
		Member member5 = new Member(1005, "에디");
		
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);
		memberHashMap.addMember(member5);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();


	}
	
}
