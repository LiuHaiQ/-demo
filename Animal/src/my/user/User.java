package my.user;


import my.atlas.Atlas;
import my.monster.Monster;
import my.count.*;

public class User {
	private int aggressivity = 100;
//攻击力默认50
	private int HR = 2000;
//生命力默认200
	private String name="小海";

//名字
	public int getAggressivity() {
		return aggressivity;
	}

	public void setAggressivity(int aggressivity) {
		this.aggressivity = aggressivity;
	}

	public void AddAggressivity(int number) {
		// 加强攻击力
		this.aggressivity = aggressivity + number;
	}

	public int getHR() {
		return HR;
	}

	public void setHR(int hR) {
		HR = hR;
	}

	public void AddHR(int number) {
		// 增加血量
		this.HR = HR + number;
	}

	public void ReduceHR(int HRnumber) {
		// 减血量
		this.HR = HR - HRnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int dice(Count count) {
		// 抛筛子
		System.out.println("总格数"+Atlas.getSum());
		System.out.println("扔筛子");
		int number = (int) ((Math.random() * 6) + 1);
		System.out.println("前进"+number+"格");
		count.countNumberDice(1);
		//扔一次加一
		return number;
	}

	public void CallMonster(Monster monster) {
		// 攻击怪物
		System.out.println("怪兽的信息"+monster);
		System.out.println(name+"攻击"+monster.getName());
		monster.ReduceHR(aggressivity);
		// 怪物减少血
		if(monster.getHR()<0)
		{
			monster.setHR(0);
			//不希望出现负数的血量
		}
		System.out.println(monster.getName()+"剩下"+monster.getHR()+"血");
	}

	@Override
	public String toString() {
		return "User [aggressivity=" + aggressivity + ", HR=" + HR + ", name=" + name + "]";
	}

}
