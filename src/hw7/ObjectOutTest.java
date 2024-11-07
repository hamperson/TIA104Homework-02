package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何
public class ObjectOutTest {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\data");
		if (!file.exists()) {
			file.mkdir();
		}

		Speakable[] animal = new Speakable[4];
		animal[0] = new Cat("kitty");
		animal[1] = new Cat("maomao");
		animal[2] = new Dog("puppy");
		animal[3] = new Dog("Collie");

		File serFile = new File("C:\\data\\Object.ser");
		FileOutputStream fos = new FileOutputStream(serFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < animal.length; i++) {
			oos.writeObject(animal[i]);
		}
		oos.close();
		fos.close();
		
	}
}
