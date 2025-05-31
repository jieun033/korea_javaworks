package bin_file;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest1 {

	public static void main(String[] args) {
		// 바이트 기반 파일 읽기
		try {
			InputStream is = new FileInputStream("c:/file/file1.bin");
			
			int data; // 읽은 데이터 저장
//			while (true) {
//				data = is.read();
//				if(data == -1) break;
//				System.out.println(data);
//			}
			
			while ((data = is.read()) != -1) {
//				System.out.println(data); // 코드값 출력
				System.out.println((char)data); // 문자 출력
			}
			is.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		// 다중 예외인 경우 부모 클래스만 사용해도 됨
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
