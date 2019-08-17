package FileMover;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// 특정 경로에 있는 파일을 불러옴.
// 그걸 특정 경로로 복사.
public class FileMover {
	
	public static void main(String[] args) {
		
		fileMoving();
		
	}
	
	
	public static void fileMoving() throws FileNotFoundException {
		
		File file = new File("c:\\zzz\\프사.jpg");
		
		System.out.println(file);
		
		FileInputStream fileInput = new FileInputStream(file);
		
		FileOutputStream fileCopy = new File
		
		
		
		
	}
	
	

}
