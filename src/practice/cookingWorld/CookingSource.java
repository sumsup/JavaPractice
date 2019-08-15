package practice.cookingWorld;

import java.util.HashMap;

public class CookingSource { // 식자재를 조달해 주는 회사.
	
	// 재료들.
	HashMap<String, Integer> 재료들 = new HashMap<String, Integer>();
	
	// 고용계약서. 재료 넣어주는 기능 추가.
	public CookingSource() {
		
		재료들.put("시금치", 3000);
		재료들.put("오이", 1000);
		재료들.put("양배추", 2500);
		재료들.put("고추가루", 5000);
		재료들.put("인스턴트김치", 3000);
		
	}
	
	// 재료 추가 하는 업무.
	public void 재료추가(String 추가재료, int 추가재료가격) {
		
		재료들.put(추가재료, 추가재료가격);
		
		System.out.println("재료목록에 \"" + 추가재료 + "(" + 추가재료가격 + ")\" 가 추가 되었습니다.");
		
	}
	
}