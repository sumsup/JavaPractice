package making.gadget;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TypingFileMaker {
	
	public static void main(String[] args) throws IOException {

		// 메인에서는 필드값을 쓸 수가 없나보다.
		TypingFileMaker start = new TypingFileMaker();
		start.fileMakerStarter();

	}

	// 필드.
	boolean go;
	String fileName;
	String inputText;

	BufferedReader in;
	BufferedOutputStream bs = null;

	public TypingFileMaker() throws IOException {
		
	}

	public void fileMakerStarter() throws IOException {

		go = true;
		in = new BufferedReader(new InputStreamReader(System.in));

		while (go) {
			
			System.out.println("\n============================================");
			System.out.println("파일 작성기 종료 명령어는 end 입니다.");
			System.out.println("만들 파일 이름을 입력해 주세요. (확장자 제외)");

			fileName = in.readLine();

			if (fileName.equals("end")) {

				System.out.println("작성기를 종료 합니다");
				go = false;
				break;

			}

			System.out.println("작성할 파일 이름 : " + fileName + ".txt");
			System.out.println("작성할 내용을 입력해 주세요.");
			
			inputText = in.readLine();

			if (inputText.equals("end")) {
				
				System.out.println("작성기를 종료 합니다");
				go = false;
				break;
				
			}
			
			System.out.println("작성할 내용 : \"" + inputText + "\" 입니다.");


			bs = new BufferedOutputStream(new FileOutputStream("c:/zzz/" + fileName + ".txt"));
			bs.write(inputText.getBytes());

			System.out.println("작성을 완료 했습니다.");

		}

		 bs.close();

	}

	// 종료기.
	public void terminator(String orderKeyword) {
		
	}

}