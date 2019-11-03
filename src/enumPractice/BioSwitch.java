package enumPractice;

import java.util.List;

public class BioSwitch {
	// 메서드 선언
	public static String textInfo(PEI index, double value) {
		String result = "";
		switch(index) {
		case PHYSICAL : result = "신체 지수: ";
			break;
		case EMOTIONAL : result = "감정 지수: ";
			break;
		case INTELLECTUAL : result = "지성 지수: ";
			break;
		default : result = "미결정: ";
			break;
		}
		
		return result + (value * 100);
	}
	
	public static void main(String[] args) {
		
		PEI index = PEI.PHYSICAL; // PEI enum을 만든다.
		double value = 0.86;
		
		System.out.println("신체 지수 주기값: " + index.getPei()); // enum을 int로 변환.
		
		String st = textInfo(index, value);
		
		System.out.println(st);
		System.out.println(index.ordinal()); // enum 값의 index 번호를 리턴.
		System.out.println(index.name()); // enum 의 생성자 값을 가져온다. key(value) 라면. key 값을 가져온다.
		System.out.println(index); // key(value) 에서 key 값을 가져온다.
		System.out.println(index.getPei()); // key(value) 에서 value 값을 가져온다.
		
		FRUIT fruit = FRUIT.APPLE;
		
		System.out.println(fruit);
		
	}
	
	public static final int COMPOSIT; // static final 멤버변수.
	static { COMPOSIT = 35; } // static 생성자.
	
}

