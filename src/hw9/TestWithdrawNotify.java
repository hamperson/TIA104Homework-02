package hw9;

/*熊大媽看到熊大帳戶的餘額超過3000元,就會停止匯款給熊大;
 * 但要是帳戶餘額在2000元以下,熊大就會要求媽媽匯款給他。
 * 如果帳戶餘額低於熊大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。
 * 假設媽媽一次匯款2000 元,熊大一次提款1000元,
 * 寫一個Java程式模擬匯款10次與提款10次的情形。*/

class BrownWithdraw {
	private int balance = 0;
//	boolean momIsEnd = false;
//	boolean sonIsEnd = false;
	boolean isEnd = false;

	synchronized public void save(int money) {
		while (balance >= 3000) {

			try {
				if (!isEnd) {
					System.out.println("媽媽看到餘額在3000以上，暫停匯款");
					wait();
					System.out.println("媽媽被熊大要求匯款");
				} else {
					break;
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
		if(balance < 3000) {
			balance += money;
			System.out.println("媽媽存了" + money + "帳戶共有：" + balance);
			notify();
		}

	}

	synchronized public void withdraw(int money) {
		while (balance < money) {
			try {
				if (!isEnd) {
					System.out.println("熊大看到帳戶沒錢，暫停提款");
					wait();
					System.out.println("熊大被老媽告知帳戶已有錢");
				}else {
					break;
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

		balance -= money;
		System.out.println("熊大領了" + money + "，帳戶共有：" + balance);
		if (balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}

class BrownMom extends Thread {
	BrownWithdraw atm;

	public BrownMom(BrownWithdraw atm) {
		this.atm = atm;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			atm.save(2000);
		}
		atm.isEnd = true;
	}
}

class Brown extends Thread {
	BrownWithdraw atm;

	public Brown(BrownWithdraw atm) {
		this.atm = atm;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			atm.withdraw(1000);
		}
		atm.isEnd = true;
	}
}

public class TestWithdrawNotify {
	public static void main(String[] args) {
		BrownWithdraw atm = new BrownWithdraw();
		BrownMom mom = new BrownMom(atm);
		Brown son = new Brown(atm);
		mom.start();
		son.start();
	}
}
