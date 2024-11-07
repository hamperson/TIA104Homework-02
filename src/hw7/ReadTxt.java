package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//請寫一個程式讀取Sample.txt檔案
public class ReadTxt {
	public static void main(String[] args) {
		File f = new File("./src/hw7/Sample.txt");
		int count = 0;
		int lineCount = 0;
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				lineCount++;
				count += line.length();
				System.out.println(line);
			}
			
			if (lineCount > 0 && line == null) {
				lineCount++;			
			}
			
//			while ((i = br.read()) != -1) {
//				System.out.print((char) i);
//				if((int)'\t' != i &&
//						  (int)'\b' != i &&
//						  (int)'\f' != i &&
//						  (int)'\r' != i &&
//						  (int)'\n' != i){
//					count += 1;
//				}
//			}

			br.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\nSample.txt檔案共" + f.length() + "個位元組，" + count + "個字元，" + lineCount + "列資料");
	}
}
