package Java2;

import java.util.HashSet;

public class ClubMember {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		HashSet<String> notcomputer = new HashSet<String>();
		HashSet<String> allStudent = new HashSet<String>();
		
		String[] computer = { "대찬", "동권", "진석", "수현", "유림", "아현", "용민", "현우", "교선",
				"민재", "기태"};
		
		String[] soccer = {"창민", "진석", "희수", "유림", "용민", "현정", "한겅", "민재", "준영", "기태",
				"동권", "지선"	};
		
		String[] dance = {"지선", "수현", "유림", "용민", "철희", "한겅", "태환", "기태", "서연", "예린",
				"현우"};
		
		String[] middle = new String[soccer.length];
		
		for(int i=0; i < soccer.length; i++) {
			for(int j=0; j<dance.length; j++) {
				if(soccer[i] == dance[j]) {
					middle[i] = soccer[i]; 
							}
				}
			}
		
		for( int i=0; i<computer.length; i++) {
			for(int  j=0; j< middle.length; j++ ) {
				if(computer[i]== middle[j]) {
					allStudent.add(computer[i]);
				}
			}
		}
		
		System.out.println("3개 동아리에 모두 참여하는 학생 명단");
		System.out.println(allStudent);
		
		
		
		
		for(String s: computer)
			hset.add(s);
		for(String s: soccer)
			hset.add(s);
		for(String s: dance)
			hset.add(s);
		System.out.println("적어도 1개이상 동아리 참여학생 명단 >>");
		System.out.println(hset);
		
		for(int i=0; i < soccer.length; i++) {
			for(int j=0; j<dance.length; j++) {
				if(soccer[i] == dance[j]) {
					notcomputer.add(soccer[i]);
				}
			}
		}
		for(int i=0; i<computer.length; i++) {
			notcomputer.remove(computer[i]);
		}
		System.out.println("soccer 또는 dance에 참여 하지만 computer에는 참여하지 않는 학생들");
		System.out.println(notcomputer);
	}

}
