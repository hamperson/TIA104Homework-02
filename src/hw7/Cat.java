package hw7;

import java.io.Serializable;

public class Cat implements Speakable, Serializable{
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
