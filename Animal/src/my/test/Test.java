package my.test;

import java.util.Scanner;

import my.atlas.Atlas;
import my.user.User;
import my.count.*;
import my.util.*;

public class Test {
	public static void main(String[] args) {
		System.out.println("游戏开始");
		Atlas.getNumber();
		// 加载地图格子
		User user = new User();
		System.out.println(user.toString());
		System.out.println("需要重置User吗(1:yes;2:No)");
		Scanner scanner = new Scanner(System.in);
		int judge = 0;
		Count count=new Count();
		//计数器
		try {
			// 怕用户输出所以使用try
			judge = scanner.nextInt();
			// 输入信息
			if (judge == 1) {
				System.out.println("请设置你的名字");
				String name = scanner.next();
				user.setName(name);
				System.out.println("请设置你的HP");
				int HP = scanner.nextInt();
				user.setHR(HP);
				System.out.println("请设置你的攻击力");
				int aggressivity = scanner.nextInt();
				user.setAggressivity(aggressivity);
				System.out.println("重置成功");
			} else if(judge==2){
			while (true) {
				int numberDice = user.dice(count);
				// 仍筛子
				
				boolean b=Atlas.randomAtlas(numberDice, user,count);
				int numberAtlas=Atlas.getNumber();
				
				System.out.println("还有"+Util.reorient(numberAtlas)+"格");
				System.out.println("继续仍(1:开始)");
				int number = scanner.nextInt();
				if(number==1){
					//false是还没有输，true输了
					if (b) {
	 					System.out.println("你输了");
						break;
					}else if(!b&&Atlas.getNumber()<=0){
						System.out.println("赢了");
						System.out.println(count);
						break;
					}
				}else{
					System.out.println("我不玩了");
					
					break;
				}


			}
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("抱歉你输入的有问题！");
			//用户乱输指令
		}
			
		
		
}
}
