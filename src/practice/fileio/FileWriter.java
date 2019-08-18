package practice.fileio;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

// 특정 경로에 있는 파일을 불러옴.
// 그걸 특정 경로로 복사.
public class FileWriter {

	public static void main(String[] args) {

		try {
			
			OutputStream output = new FileOutputStream("C:/zzz/Output.txt"); // 파일을 출력하는 스트림(길)을 만든다.
			// 수로를 뚫어 놓는 느낌.
			
			// 키보드 입력 받는 기능.
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String str = in.readLine();
			
			byte[] by = str.getBytes(); // 바이트 코드를 가져온다. 
			output.write(by); // 파일 스트림에 쓴다.
			
			System.out.println("파일 쓰기 성공!");
			
			in.close();

		} catch (Exception e) {
			
			e.getStackTrace();
			
		}
		
	}

}
