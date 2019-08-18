package practice.fileio;

import java.io.FileInputStream;
import java.io.IOException;

public class InputBufferedStream {

	public static void main(String[] args) throws IOException {
		
		try {
			// 바이트 단위로 파일읽기
			String filePath = "C:/zzz/Output.txt"; // 대상 파일
			
			FileInputStream fileStream = null; // 파일 스트림

			fileStream = new FileInputStream(filePath);// 파일 스트림 생성
			
			// 배열 바이트 타입의 버퍼 선언.
			byte[] readBuffer = new byte[fileStream.available()];
			// available() : an estimate of the number of remaining bytes that can be read 
			//               (or skipped over) from this input stream without blocking.
			// 파일의 읽을 수 있는 바이트 수를 반환.
			
			while (fileStream.read(readBuffer) != -1) {
				
				System.out.println(new String(readBuffer)); // 출력
				
			}

			fileStream.close(); // 스트림 닫기.
			
		} catch (Exception e) {
			
			e.getStackTrace();
			
		}
		
	}

}