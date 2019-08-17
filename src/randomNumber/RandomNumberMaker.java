package randomNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomNumberMaker {
	
	public static void main(String[] args) throws IOException {
		
		randomNumStarter();
		
	}
	
	public static void randomNumStarter() throws IOException {
		
		System.out.println("두 숫자 사이의 랜덤 숫자를 만듭니다!");
		System.out.println("1번째 정수를 입력하세요!");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int startNum = Integer.parseInt(in.readLine());

		System.out.println("2번째 정수를 입력하세요!");
		int endNum = Integer.parseInt(in.readLine());
		
		// x ~ y 사이의 랜덤 숫자를 만듭니다.
		int randomNumber = makeRandomNumber(startNum, endNum);
		
		System.out.println("생성된 랜덤 숫자는 " + randomNumber + "입니다!");

	}
	
	// 입력한 숫자 사이의 정수값을 난수로 발생시키는 업무.
	public static int makeRandomNumber(int startNum , int endNum) {
		
		// 사용자 입력 보정.
		// 만약 사용자가 같은 수를 입력했으면?
		if(startNum == endNum) {
			
			return startNum;
			
		}
				
		//만약 사용자가 처음 입력한 수가 더 크면?
		if(startNum > endNum) {
			
			int temp = endNum;
			endNum = startNum;
			startNum = temp;
			
		}
		
		Random r = new Random();
		
		// 1. startNum과 endNum 사이의 값이 아니면 계속 난수 생성.
		boolean randomNumOk = false; // startNum과 endNum 사이 값인지 확인.
		int randomNum = 0;
		
		while(!randomNumOk) {
			
			randomNum = r.nextInt(endNum);
			
			if(randomNum >= startNum) {
				
				randomNumOk = true; 
			
			}
			
		}
		
		return randomNum;
		
		// 2. startNum으로 시작해서 endNum으로 끝나는 배열을 만들고.
		// 그 배열에서 임의로 하나의 값을 꺼내도록 함.
	}
	
}