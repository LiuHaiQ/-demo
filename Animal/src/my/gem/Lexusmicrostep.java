package my.gem;

import my.atlas.Atlas;

public class Lexusmicrostep extends Gem {
	private String name = "凌波微步";
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void result() {
		System.out.println("凌波微步开启中");
	int random=(int) (Math.random()*6)+1;
	while(random==1) {
		//不允许出现1，因为至少前进2格
		random=(int) (Math.random()*6)+1;
	}
	System.out.println("特效加速"+random+"格");
	Atlas.reduceNumber(random);
	//减少格数
	//System.out.println("使用特效后还有"+Atlas.getNumber()+"格");
	}
}
