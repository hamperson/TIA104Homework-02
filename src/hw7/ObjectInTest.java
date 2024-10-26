package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInTest {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
		ObjectInputStream ois = new ObjectInputStream (fis);
		
		try {
			
			while (true) {
				((Speakable)ois.readObject()).speak();
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
		
	}
}
