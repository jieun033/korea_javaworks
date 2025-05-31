package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {
		// 보조 스트림 - Buffered 스트림
		// 버퍼(buffer)는 임시 기억 장소를 의미
		// 보조 스트림은 기반 스트림을 생성자의 매개변수로 사용해야 함.
		// 이유는 보조 스트림이 독립적으로 입출력을 수행할 수 없기 때문임.
		String originFile = "C:\\javaworks\\Chapter11\\white-cat.jpg";
		String copyFile = "C:\\javaworks\\Chapter11\\white-cat3.jpg";
		long start, end; // 시작 시간, 종료 시간
		
		try(InputStream is = new FileInputStream(originFile); // 기반 스트림
			OutputStream os = new FileOutputStream(copyFile); // "
			BufferedInputStream bis = new BufferedInputStream(is); // 보조 스트림
			BufferedOutputStream bos = new BufferedOutputStream(os)) {
			
			start = System.currentTimeMillis(); // 시작
			
			// 읽고 쓰기
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			end = System.currentTimeMillis(); // 종료
			System.out.printf("복사 시간: %dms", (end - start));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
