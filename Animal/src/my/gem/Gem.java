package my.gem;

import my.user.User;

public class Gem {

	private String name;
	private  int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void result(User user) {
		System.out.println("父类");
	}
	public void result() {
		System.out.println("父类");
	}
}
