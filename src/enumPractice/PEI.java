package enumPractice;

// Enum은 상수를 묶은 클래스.
public enum PEI { // enum 클래스.

	// 위에 선언된 pei로 final 인스턴스를 생성.
	PHYSICAL(23), // PHYSICAL은 상수값으로 23을 가짐. key(value) 와 비슷.
	EMOTIONAL(28), // EMOTIONAL은 상수값으로 28을 가짐.
	INTELLECTUAL(33); // INTELLECTUAL은 상수값으로 33을 가짐.
	
	private final int peiValue;
	
	// 생성자.
	PEI(int pei) {  
		this.peiValue = pei;
	}
	
	public int getPei() {
		return peiValue;
	}
	
}

// 생성자와 사용자 정의가 없는 enum.
enum FRUIT {
	APPLE, BANANA, MANGO
}