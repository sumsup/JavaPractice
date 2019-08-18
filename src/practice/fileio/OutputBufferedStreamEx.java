package practice.fileio;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutputBufferedStreamEx {

	public static void main(String[] args) throws IOException {
		
		BufferedOutputStream bs = null;
		BufferedReader in = null;
		
		try {
			
			System.out.println("");
			System.out.println("===================================");
			System.out.println("입력해주세요.");
			
			bs = new BufferedOutputStream(new FileOutputStream("c:/zzz/BufferedOutputStream2.txt"));
			in = new BufferedReader(new InputStreamReader(System.in));
			
			String str = in.readLine();
			
			bs.write(str.getBytes());

		} catch (Exception e) {
			
			e.getStackTrace();
			
		} finally {
			
			bs.close(); // 반드시 닫는다.
			in.close();
			
		}
		
	}

}