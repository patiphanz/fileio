package ku.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtil {
	
	static void copy(InputStream in, OutputStream out){
		int b;
		try {
			b = in.read();
			while( b > 0 ) {    // read() returns -1 at end of file
				out.write( (byte)b );
				b = in.read( );
				}
		} catch (IOException e) {
			throw new RuntimeException();
		} 
		

	}
	
	static void copy(InputStream in, OutputStream out, int blocksize){
		byte[] buffer = new byte[blocksize];
		try {
			while (true){
			int count = in.read(buffer);
			out.write(buffer,0,blocksize);
			if(count < 0) break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void bcopy(InputStream in, OutputStream out){
		
	}
	
}

