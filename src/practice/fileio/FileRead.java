package practice.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 텍스트 파일 읽기.
public class FileRead {

	public static void main(String[] args) {

		try {
			// 파일 객체 생성
			File file = new File("c:/zzz/Output.txt");
			
			// 입력 스트림 생성
			FileReader file_reader = new FileReader(file);
			
			int cur = 0;
			
			while ((cur = file_reader.read()) != -1) { 
				// 아마 read() 는 한글자 한글자 읽어서 cur에 다 넣고
				// 내용이 없으면 -1을 반환.
				// 한글자씩 출력하는 것.
				
				System.out.print((char) cur);
				
			}
			
			file_reader.close();
			
		} catch (FileNotFoundException e) {
			
			e.getStackTrace();
			
		} catch (IOException e) {
			
			e.getStackTrace();
			
		}

	}

}