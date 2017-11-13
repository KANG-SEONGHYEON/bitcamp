package bitcamp.java100.ch14.ex2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

// 상속이 아닌 위임을 이용한 기능 확장.
public class MyBufferedOutputStream2 {
	
	OutputStream worker;
	
	byte[] buf = new byte[8192];
	int len;
	int cursor;
	
	public MyBufferedOutputStream2(OutputStream worker) throws FileNotFoundException {
		this.worker = worker;
	}
	
	public void write(int b) throws IOException {
		if (cursor == buf.length) {
			worker.write(buf, 0, 8192);
			cursor = 0;
		}
		
		buf[cursor++] = (byte)b;
	
	}
	
	public void flush() throws IOException {
		// 버퍼에 남아있는 데이터를 마저 출력한다.
		worker.write(buf, 0, cursor);
		cursor = 0;
	}
	
}
