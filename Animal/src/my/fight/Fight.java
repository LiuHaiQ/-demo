package my.fight;

import my.monster.Monster;
import my.user.User;
import my.count.*;

public class Fight {
//战斗
	public boolean myFight(User user, Monster monster,Count count) {
		while(true) {
			user.CallMonster(monster);
			if (monster.getHR()<=0) {
				System.out.println(user.getName()+"赢了");
				count.countNumberMonster(1);
				//打赢了怪兽加1
				return false;
				
			}
			monster.CallUser(user);
			if (user.getHR()<=0) {
				System.out.println(user.getName()+"输了");
				
				return true;
			
			}
		}
	}
}
