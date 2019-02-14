package my.atlas;

import my.cell.RandomCell;
import my.fight.Fight;
import my.gem.Gem;
import my.gem.Hragent;
import my.gem.Lexusmicrostep;
import my.gem.Strengthagent;
import my.monster.Gecko;
import my.monster.Monster;
import my.monster.Squirrel;
import my.monster.Unicorn;
import my.user.User;
import my.count.*;

public class Atlas {
	private static int number;
	// 地图的总格数，每向前一步减一步
	private static final int sum;
	// 总数用来成功后的数据
	
	static {
		int orgin = RandomCell.getOrigin();
		// 起点
		int TerminalPoint = RandomCell.getTerminalPoint();
		// 终点
		number = TerminalPoint - orgin;
		sum = number;
	}

	public static int getSum() {
		return sum;
	}

	public static Monster randomMonster() {
		// 随机怪兽
		int random = (int) (Math.random() * 4) + 1;
		// 1是松鼠
		// 2是独角兽
		// 3是壁虎小强
		if (random == 1) {
			Monster squirrel = new Squirrel();
			// 小松鼠
			return squirrel;
		} else if (random == 2) {
			Monster unicorn = new Unicorn();
			// 独角兽
			return unicorn;
		} else {
			Monster gecko = new Gecko();
			// 壁虎小强
			return gecko;

		}
	}

	public static void randomGem(User user) {
		
		// 随机珍宝
		int random = (int) (Math.random() * 4) + 1;
		// 1是力量药剂
		// 2HP药剂
		// 3凌波微步
		if (random == 1) {
			// 1是力量药剂
			System.out.println("力量药剂");
			Gem strengthagent = new Strengthagent();
			strengthagent.result(user);
		} else if (random == 2) {
			System.out.println("HP药剂");
			Gem hragent = new Hragent();
			// 2HP药剂
			hragent.result(user);
		} else {
			System.out.println("凌波微步");
			Gem lexusmicrostep = new Lexusmicrostep();
			// 3凌波微步
			lexusmicrostep.result();
		}
	}

	public static boolean randomAtlas(int number, User user,Count count) {
		// 随机格子
		int random = (int) ((Math.random() * 3) + 1);
		if (random == 1) {
//		等于1就是危险格子
			System.out.println("危险格子");
			Monster monster = randomMonster();
			// 怪兽
			Fight fight=new Fight();
		boolean b=	fight.myFight(user, monster,count);
			reduceNumber(number);
			// 减格子
			
			return b;
		} else if (random == 2) {
//福利格子
			System.out.println("福利格子");
			randomGem(user);
			reduceNumber(number) ;
			// 减格子
			count.countNumberGem(1);
			//加珍宝的个数
			return false;
		} else {
			System.out.println("正常格子");
			reduceNumber(number);
			
			
			return false;
// 减格子
		}
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Atlas.number = number;
	}

	public static void reduceNumber(int number) {
		// 减少格数
		Atlas.number = Atlas.number - number;
	}

}
