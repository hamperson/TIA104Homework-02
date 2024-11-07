package hw9;

//饅頭人與詹姆士參加快胃王比賽
public class BigEater implements Runnable {
	int counter = 0;
	String name;

	public BigEater() {
	}

	public BigEater(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void run() {

		try {
			while (counter < 10) {
				counter++;
				System.out.println(name + "吃第" + counter + "碗飯");
				int r = (int) (Math.random() * 2500) + 500;
				Thread.sleep(r);
			}
			System.out.println(name +"吃完了!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		BigEater be = new BigEater("詹姆士");
		Thread t1 = new Thread(be);
		BigEater be2 = new BigEater("饅頭人");
		Thread t2 = new Thread(be2);
		System.out.println("----大胃王快食比賽開始!----");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("----大胃王快食比賽結束!----");
		
		
	}

}
