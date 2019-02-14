package my.count;

public class Count
{
	private int countNumberDice;
	//扔筛子的次数
	private int countNumberMonster;
	//打怪次数
	private int countNumberGem;
	//获得珍宝次数
    private int countNumberCell;
	//筛子的格子


	public void setCountNumberDice(int countNumberDice)
	{
		this.countNumberDice = countNumberDice;
	}

	public int getCountNumberDice()
	{
		return countNumberDice;
	}

	public void setCountNumberMonster(int countNumberMonster)
	{
		this.countNumberMonster = countNumberMonster;
	}

	public int getCountNumberMonster()
	{
		return countNumberMonster;
	}

	public void setCountNumberGem(int countNumberGem)
	{
		this.countNumberGem = countNumberGem;
	}

	public int getCountNumberGem()
	{
		return countNumberGem;
	}

	public void setCountNumberCell(int countNumberCell)
	{
		this.countNumberCell = countNumberCell;
	}

	public int getCountNumberCell()
	{
		return countNumberCell;
	}
	public void countNumberMonster(int number){
		this.countNumberMonster=countNumberMonster+number;
	}
	public void countNumberGem(int number){
		this.countNumberGem=countNumberGem+number;
	}
	public void countNumberDice(int number){
		this.countNumberDice=countNumberDice+number;
	}
	public void countNumberCell(int number){
		this.countNumberCell=countNumberCell+number;
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		return "扔了"+countNumberDice+"次筛子"+"杀死了"+countNumberMonster+"只怪兽"+"获得"+countNumberGem+"次珍宝";
	}
	
}
