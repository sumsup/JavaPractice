package practice.humanWorld;

public class Friends {
	
	int 나이;
	String 이름;
	String 사는곳;
	String 전공;
	String 학교;
	int 키;
	int 몸무게;
	boolean 결혼;
	String 직업;
	
	public Friends(int 나이, String 이름, String 사는곳, String 전공, String 학교, int 키, int 몸무게, boolean 결혼, String 직업) {
		
		super(); // super 클래스의 생성자를 사용하겠다.
		
		this.나이 = 나이;
		this.이름 = 이름;
		this.사는곳 = 사는곳;
		this.전공 = 전공;
		this.학교 = 학교;
		this.키 = 키;
		this.몸무게 = 몸무게;
		this.결혼 = 결혼;
		this.직업 = 직업;
		
	}

	public int get나이() {
		return 나이;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get사는곳() {
		return 사는곳;
	}

	public void set사는곳(String 사는곳) {
		this.사는곳 = 사는곳;
	}

	public String get전공() {
		return 전공;
	}

	public void set전공(String 전공) {
		this.전공 = 전공;
	}

	public String get학교() {
		return 학교;
	}

	public void set학교(String 학교) {
		this.학교 = 학교;
	}

	public int get키() {
		return 키;
	}

	public void set키(int 키) {
		this.키 = 키;
	}

	public int get몸무게() {
		return 몸무게;
	}

	public void set몸무게(int 몸무게) {
		this.몸무게 = 몸무게;
	}

	public boolean is결혼() {
		return 결혼;
	}

	public void set결혼(boolean 결혼) {
		this.결혼 = 결혼;
	}

	public String get직업() {
		return 직업;
	}

	public void set직업(String 직업) {
		this.직업 = 직업;
	}

	@Override
	public String toString() {
		return "Friends [나이=" + 나이 + ", 이름=" + 이름 + ", 사는곳=" + 사는곳 + ", 전공=" + 전공 + ", 학교=" + 학교 + ", 키=" + 키 + ", 몸무게="
				+ 몸무게 + ", 결혼=" + 결혼 + ", 직업=" + 직업 + "]";
	}
	
	
	
}
