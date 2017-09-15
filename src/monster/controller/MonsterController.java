package monster.controller;

import monster.model.MarshmellowMonster;
import java.util.Scanner;

public class MonsterController
{
	
	public void start()
	{
		MarshmellowMonster basic = new MarshmellowMonster();
		
		MarshmellowMonster jeremy = new MarshmellowMonster("Silly Jermemy Monster", 10, 5, 4, true);
		System.out.println(jeremy);
		System.out.println("I am feeling hungry, I am going to eat one of Jeremy's arms");
		jeremy.setArmCount(jeremy.getArmCount() -1);
		System.out.println(jeremy);
		
		interactWithMonster(jeremy);
	}
	 
	private void interactWithMonster(MarshmellowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyecount() - consumed);
		System.out.println(currentMonster);
		
		System.out.println(currentMonster.getName() + " is now wondering how many of his tentacles you'd like to eat");
		int eaten = myScanner.nextInt();
		currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - eaten);
		System.out.println(currentMonster);
		
		System.out.println(currentMonster.getName() + " would know like to know how many of his arms you wish to devour this fine dinning evening");
		int devoured = myScanner.nextInt();
		currentMonster.setArmCount(currentMonster.getArmCount() - devoured);
		System.out.println(currentMonster);
		
		myScanner.close();
	}
}