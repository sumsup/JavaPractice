package practice.cookingWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Cooker { // 클래스는 일꾼. 하나의 일꾼이 하는 업무도구와 업무를 설계한다.
	
	// 멤버변수는 업무도구.
	int 요리횟수 = 0;
	int 라면가격 = 4000;
	int 스파게티가격 = 9000;
	int 짜장면가격 = 6000;
	int 매출 = 0;
	Map<String, Integer> 메뉴판 = new HashMap<String, Integer>();
	
	// 생성자는 고용.
	public Cooker() {
		
		메뉴판.put("라면", 라면가격);
		메뉴판.put("스파게티", 스파게티가격);
		메뉴판.put("짜장면", 짜장면가격);
		
	}
		
	public void 주문이요() throws IOException {
		
		System.out.println("=================================================");
		System.out.println("메뉴판을 보여드립니다.");
		System.out.println("아래 음식중에서 하나를 선택 하세요.");

        Iterator<String> keys = 메뉴판.keySet().iterator();
		
        while( keys.hasNext()) {
        	
			String 요리 = keys.next();
			System.out.println(요리+" : "+메뉴판.get(요리) + "원");
			
		}
        
        String 주문 = 주문입력받기();
        재료주문();
        요리횟수올리기();
        매출에더하기(주문);
        
        System.out.println("요리사가 요리한 횟수는? "+ 요리횟수 + "번 째 요리 했습니다.");
		
	}
	
	public String 주문입력받기() throws IOException {
		// 주문 입력 받기.
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String 주문 = in.readLine();
        
        System.out.println(주문 + "을/를 주문하셨습니다.");
        
        return 주문;
		
	}
	
	public void 요리횟수올리기() {
		
		요리횟수++;
		
	}
	
	public void 매출에더하기(String 주문) {
		
		매출 += 메뉴판.get(주문);
		
		System.out.println("오늘의 총매출은 "+매출+"원 입니다.");
		
	}
	
	public void 재료주문() throws IOException {
		
		CookingSource 주문 = new CookingSource();
		
		Iterator<String> keys = 주문.재료들.keySet().iterator();
		
		while( keys.hasNext()) {
			
			String 재료 = keys.next();
			System.out.println("재료 : \""+재료+ "\" 의 가격은 "+주문.재료들.get(재료)+" 원 입니다.");
			
		}
		
		// 재료를 추가 하시겠습니까?
		System.out.println("혹시 주문 재료를 추가하시겠습니까? (yes/no)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String 주문재료추가여부 = in.readLine();
				
		if(주문재료추가여부.equals("yes")) {
			
			출력("추가하실 주문 재료 이름을 입력해주세요.");
			String 추가주문재료 = in.readLine();
			출력("추가하실 주문 재료의 단가를 입력해 주세요. (숫자만 입력)");
			String 추가주문재료가격입력 = in.readLine();
			int 추가주문재료가격 = Integer.parseInt(추가주문재료가격입력);
			
			주문.재료추가(추가주문재료, 추가주문재료가격);
			
			출력("추가하실 주문 재료는 \""+추가주문재료+"\" 이며 가격은 \""+ 추가주문재료가격+"\" 원 입니다.");
			
		}
		
		
	}
		
	public void 출력(String 출력할것) {
		
		System.out.println(출력할것);
		
	}
	
	

}