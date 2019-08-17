package practice.cookingWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 입력테스트 {

	public static void main(String[] args) throws IOException {
		
		입력받기();
		
	}
	
	public static void 입력받기() throws IOException {
		
 		boolean rotation = true;
 		
 		System.out.println("start!");
 		
 		BufferedReader in = new BufferedReader(new InputStreamReader(System.in, "utf-8"));
		
		while(rotation) {
			
			
			String a = in.readLine();
			
			if(a.equals("exit")) {
				
								
				break;
				
			}
			
			System.out.println(" 입력하신 문자열은 : "+a);
			System.out.println(" ");
			a = "";
			
			
		}
		
		in.close();
		
		System.out.println("game over!");
		
		
	}
	
}
