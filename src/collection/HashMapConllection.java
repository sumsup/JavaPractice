package collection;

import java.util.HashMap;

public class HashMapConllection {
	
	public static void main(String[] args) {
		
		// HashMap : 일반적인 맵 구현.
		// LinkedHashMap : 추가한 순서를 유지하는 Map 구현.
		
		HashMap<String, String> map = new HashMap();
		
		map.put("이름", "김민수");
		map.put("나이", "34");
		map.put("거주지", "성내동");
		
		for(String key : map.keySet()) { // map.keySet() : 맵에 있는 key의 value들을 set에 담아서 반환.
			String value = map.get(key);
			System.out.println(value);			
		}
		System.out.println("===========================");
		
		map.remove("거주지");
		
		for(String key : map.keySet()) {
			String value = map.get(key);
			System.out.println(value);
		}
		System.out.println("===========================");
		
		map.clear();
		System.out.println("map 이 비었습니까? " + map.isEmpty());
		System.out.println("===========================");
		
		map.put("이름", "정해림");
		map.put("나이", "24");
		map.put("거주지","동경");
		
		for(String key : map.keySet()) {
			String value = map.get(key);
			System.out.println(value);
		}
		System.out.println("===========================");
		
		System.out.println("map의 요소 갯수는 ? " + map.size());
		System.out.println("map에 \"이름\"이 있습니까? " + map.containsKey("이름"));
		System.out.println("map에 \"학력\"이 있습니까? " + map.containsKey("학력"));
		System.out.println("map에 \"정해림\"이 있습니까? " + map.containsValue("정해림"));
		System.out.println("map에 \"강만식\"이 있습니까? " + map.containsValue("강만식"));
		
		System.out.println("===========================");
		
	}
}
