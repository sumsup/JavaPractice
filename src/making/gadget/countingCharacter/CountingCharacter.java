package making.gadget.countingCharacter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingCharacter {
	
	public static void main(String[] args) throws IOException {
		
		counting();
		
	}
	
	// 문자열 길이 체크.
	public static void counting() throws IOException {
		
		System.out.println("글자수를 샐 문장을 입력해 주세요.");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String text = in.readLine();
		
		int textLength = text.length();
		
		System.out.println("본문의 문자열 길이는 : "+textLength + " 자 입니다.");
		
		
	}

}