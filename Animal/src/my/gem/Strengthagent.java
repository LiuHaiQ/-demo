package my.gem;

import my.user.User;

public class Strengthagent extends Gem {
	//草泥马力量药剂
	private  int number=5;
	//不可修改
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void result(User user) {
		//效果
		System.out.println("原本的攻击力"+user.getAggressivity());
		user.AddAggressivity(number);
		//加攻击力
		System.out.println(user);
	}
}
