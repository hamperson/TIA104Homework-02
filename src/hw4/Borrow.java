package hw4;

//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
import java.util.Scanner;

public class Borrow {
	private int num;
	private int money;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Borrow(int num, int money) {
		this.num = num;
		this.money = money;
	}

	public static void main(String[] args) {

		Borrow[] people = {new Borrow(25, 2500), 
							new Borrow(32, 800), 
							new Borrow(8, 500), 
							new Borrow(19, 1000),
							new Borrow(27, 1200)};

		Scanner s = new Scanner(System.in);
		System.out.println("你要借多少");
		int data = s.nextInt();
		

		int sum = 0;
		for (int i = 0; i < people.length; i++) {
			Borrow person = people[i];
		
			if (data <= person.getMoney()) {
				sum++;
				if (sum == 1) {
					System.out.print("有錢可借的員工編號:");
				}
				System.out.print(person.getNum() + " ");
			}
		}
		System.out.println("共" + sum + "人");
		if (sum == 0) {
			System.out.println("沒人可借");
		}
		s.close();
	}
}
