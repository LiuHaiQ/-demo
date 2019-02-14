package my.monster;

import my.user.User;

public class Gecko extends Monster {
	private int aggressivity;
	// 攻击力
	private int HR;
	// 生命力
	private String name = "独角兽";

	public Gecko() {
		// 怪兽的综合力
		this.aggressivity = (int) ((Math.random() * 15) + 21);
		this.HR = (int) (Math.random() * 80) + 101;

	}

	public int getAggressivity() {
		return aggressivity;
	}

	public void setAggressivity(int aggressivity) {
		this.aggressivity = aggressivity;
	}

	public int getHR() {
		return HR;
	}

	public void setHR(int hR) {
		HR = hR;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void CallUser(User user) {
		// 攻击用户
		System.out.println("怪兽:"+name+"攻击"+user.getName());
		user.ReduceHR(aggressivity);
		// 用户减少血
		
		System.out.println("用户"+user+getName()+"还剩"+user.getHR()+"血");
	}

	public void ReduceHR(int HRnumber) {
		this.HR = HR - HRnumber;
		// 怪物减血
	}

	@Override
	public String toString() {
		return "Gecko [aggressivity=" + aggressivity + ", HR=" + HR + ", name=" + name + "]";
	}

}
