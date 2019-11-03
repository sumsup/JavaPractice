package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {

	public static void main(String[] args) {
		
		// Set은 중복을 허용하지 않음.
		Set<String> set = new HashSet();
		
		set.add("개");
		set.add("고양이");
		set.add("토끼");
		set.add("고라니");
		set.add("무소");
		
		System.out.println("set 의 요소 갯수는? " + set.size());
		
		for(String animal : set) {
			System.out.println(animal);
		}
		System.out.println("===========================");
		
		set.remove("토끼");
		
		for(String animal : set) {
			System.out.println(animal);
		}
		System.out.println("===========================");
		
		set.clear(); // 요소를 다 지운다.
		
		for(String animal : set) {
			System.out.println(animal);
		}
		System.out.println("===========================");
		
		
		set.add("멍멍이");
		set.add("바둑이");
		set.add("냥냥이");
		set.add("꼬몽미");
		
		for(String animal : set) {
			System.out.println(animal);
		}
		System.out.println("===========================");
		
		System.out.println("set에 바둑이가 들어있습니까? " + set.contains("바둑이"));
		System.out.println("set에 호랑이가 들어있습니까? " + set.contains("호랑이"));
		
	}

}
