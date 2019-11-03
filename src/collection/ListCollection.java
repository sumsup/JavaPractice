package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("철수");
		list.add("영희");
		list.add("길동");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println("========================");
		
		list.set(1, "지영");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println("========================");
		
		list.remove(0); // 0번을 지우면 뒤에 index들이 앞으로 당겨져 옴.
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println("========================");
		
		list.clear(); // 리스트를 전부 지운다.
		
		list.add("만수"); // 다 지운 후 넣는다.
		list.add("병수");
		list.add("찬수");
		list.add("병진");
		list.add("석현");
		
		System.out.println("list의 요소 갯수는? "+ list.size());
		
		// 확장 for문.
		for(String name : list) { 
			System.out.println(name);
		}
		
		System.out.println("==========================");
		
		// iterator 사용.
		list.add("iterator 사용!");
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) { // 다음 값이 있으면 true를 리턴.
			
			String name = it.next();
			System.out.println(name);
			
		}
		
		System.out.println("==========================");
		
		list.clear();
		
		System.out.println("list is Empty : " + list.isEmpty());
		
	}
	
}