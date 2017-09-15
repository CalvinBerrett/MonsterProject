package monster.controller;

import monster.model.MarshmellowMonster;

public class MonsterController
{
	
	public void start()
	{
		MarshmellowMonster basic = new MarshmellowMonster();
		System.out.println(basic);
		MarshmellowMonster jeremy = new MarshmellowMonster("Silly Jermemy Monster", 7, 3, 6.7, true);
		System.out.println(jeremy);
	}
}