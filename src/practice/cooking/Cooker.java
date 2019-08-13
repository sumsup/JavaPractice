package practice.cooking;

import java.util.Iterator;
import java.util.Map;

public class Cooker { // 클래스는 일꾼. 하나의 일꾼이 하는 업무도구와 업무를 설계한다.
	
	// 멤버변수는 업무도구.
	int 요리횟수 = 0;
	int 라면가격 = 4000;
	int 스파게티가격 = 9000;
	int 짜장면가격 = 6000;
	int 매출 = 0;
	Map<String, Integer> 메뉴판;
	
	// 생성자는 고용.
	public Cooker() {
		
		메뉴판.put("라면", 라면가격);
		메뉴판.put("스파게티", 스파게티가격);
		메뉴판.put("짜장면", 짜장면가격);
		
	}
		
	public void 주문이요() {
		
		System.out.println("메뉴판을 보여드립니다.");
		System.out.println("아래 음식중에서 하나를 선택 하세요.");

        Iterator<String> keys = 메뉴판.keySet().iterator();
		
        while( keys.hasNext()) {
        	
			String 요리 = keys.next();
			System.out.println(요리+" : "+메뉴판.get(요리) + "원");
			
		}
		
	}
	
	public void 요리횟수올리기() {
		
		요리횟수++;
		
	}
	
	

}
