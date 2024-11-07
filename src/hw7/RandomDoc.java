package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡
//(請使用append功能讓每次執行結果都能被保存起來)
public class RandomDoc {
	public static void main(String[] args) {
		try {
			
			FileWriter fw = new FileWriter("./src/hw7/Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			int [] ten = new int [10];
			for(int i = 0; i < ten.length; i++) {
				int ran = (int)(Math.random()*1000)+1;
				ten[i] = ran;
				pw.println(ten[i]);
				
				
			}
			
			pw.close();
			bw.close();
			fw.close();
		} catch(IOException e){
			e.printStackTrace();
			
		}
		
		
	}
}
