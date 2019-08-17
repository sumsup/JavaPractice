package KeyboardInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {
	
	public static void main(String[] args) throws IOException {
		
		boolean go = false;
		
		while(!go) {
			
			String inputText = keyboardInput();
			System.out.println("입력 받은 값은 " + inputText + "입니다");
			
			if(inputText.equals("end")) {
				
				System.out.println("end를 입력하셨으니 사용자 입력을 종료 합니다.");
				go = true;
				
			}
			
		}
		
	}

	public static String keyboardInput() throws IOException {
		
		System.out.println("사용자에게서 키보드 입력을 받습니다.");
		System.out.println("입력을 종료하시려면 end를 입력 하세요.");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String inputText = in.readLine();
		
		return inputText;
		
	}
	
}