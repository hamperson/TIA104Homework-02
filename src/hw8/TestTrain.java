package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTrain {
	public static void main(String[] args) {
		List<Train> list = new ArrayList<Train>();
		Train tr1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train tr2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train tr3 = new Train(118, "自強", "高雄", "台北", 500);
		Train tr4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train tr5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train tr6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train tr7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		list.add(tr1);
		list.add(tr2);
		list.add(tr3);
		list.add(tr4);
		list.add(tr5);
		list.add(tr6);
		list.add(tr7);
		
		//印出不重複的Train物件
		//list轉set
		System.out.println("印出不重複的Train物件");
		Set<Train> trainList = new HashSet<>(list);
//		List<Train> trainList = new ArrayList<Train>(new HashSet(list));
		Iterator obj = trainList.iterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}
		
		//讓Train物件印出時，能以班次編號由大到小印出
		System.out.println("\n以班次編號由大到小印出");
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		//讓班次編號由大排到小印出， 還可以不重複印出Train物件
		System.out.println("\n以班次編號由大到小印出，且不重複");

		TreeSet<Train>sortedSet = new TreeSet<>(new HashSet(trainList));
		for (Train train : sortedSet) {
			System.out.println(train);
		}
	}
}
