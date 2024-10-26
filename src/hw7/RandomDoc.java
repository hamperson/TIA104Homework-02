package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RandomDoc {
	public static void main(String[] args) {
		try {
			
			FileWriter fw = new FileWriter("c:/TIA104_Workspace/Data.txt", true);
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
