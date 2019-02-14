package my.gem;

import my.user.User;

public class Hragent extends Gem {
	private String name = "草泥马HP药剂";
	private  int number=150;
	//特效药
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void result(User user) {
		// 效果
		System.out.println("原本的血量"+user.getHR());
		user.AddHR(number);
		//加血
		System.out.println(user);
	}
}
