package my.cell;


public class RandomCell {
	private static int origin;
	//起点
	private static int TerminalPoint;
	//终点
	 public static int getOrigin() {
		//起点
		while (true) {
			 origin=(int)(Math.random()*300)+1;
			if (origin>=200&&origin<=300) {
				//大于等于200或小于等于300，条件成立否则继续循环
				return origin;
			}else {
				continue;
			}
		}
	}
		 public static int getTerminalPoint() {
			//终点
			while (true) {
				 TerminalPoint=(int)(Math.random()*300)+1;
				if (origin<TerminalPoint&&TerminalPoint<=300) {
					//大于等于200或小于等于300，条件成立否则继续循环
					return TerminalPoint;
				}else {
					continue;
				}
			}
	}
}
