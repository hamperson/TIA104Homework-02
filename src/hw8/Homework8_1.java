package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Homework8_1 {
	public static void main(String[] args) {
		Collection data = new ArrayList();
		data.add(100);
		data.add(3.14);
		data.add(21L);
		data.add("100");
		data.add(5.1);
		data.add("Kitty");
		data.add((short) 100);
		data.add(new Object());
		data.add("Snoopy");
		data.add(new BigInteger("1000"));

		//印出這個物件裡的所有元素
		
		
		System.out.println("傳統的for 迴圈");
		for (int i = 0; i < ((ArrayList<Object>)data).size(); i++) {
			System.out.println(((ArrayList<Object>)data).get(i));
		}
		System.out.println();
		System.out.println("iterator");
		for (Iterator it = data.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println();

		System.out.println("foreach");
		for (Object obj : data) {
			System.out.println(obj);
		}
		System.out.println();

		System.out.println("移除不是java.lang.Number相關的物件並印出");
		Iterator it = data.iterator();
		while (it.hasNext()) {
			Object ob = it.next();
			if (!(ob instanceof Number)) {
				it.remove();
			}
		}
		
		//再次印出這個集合物件的所有元素
		for (Object obj : data) {
			System.out.println(obj);
		}
		
		//方法二
//		data.removeIf(obj -> !(obj instanceof Number));
//		
//		System.out.println("\n移除非 number 相關物件後的集合內容:");
//		for (Object obj : data) {
//			System.out.println(obj + " ");
//		}
	}
}
