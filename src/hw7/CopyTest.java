package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。
//呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案
public class CopyTest {
	public static void main(String[] args) {
		File inputFile = new File("copied.txt");
		File outputFile = new File("destination.txt");
			try	{
				copyFile(inputFile, outputFile);
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	public static void copyFile(File inputFile, File outputFile) throws IOException{
		try
		(FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);){
			int c;
			
			while((c = in.read()) != -1) {
				out.write(c);
//				System.out.print((char)c);
//				System.out.flush();
			}
			in.close();
			out.close();
		}
	}
}
