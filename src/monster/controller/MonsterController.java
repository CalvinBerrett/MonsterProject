package monster.controller;

import monster.model.MarshmellowMonster;
import java.util.Scanner;

public class MonsterController
{
	
	public void start() throws InterruptedException
	{
		MarshmellowMonster basic = new MarshmellowMonster();
		
		MarshmellowMonster jeremy = new MarshmellowMonster("Jeremy The Grand", 10, 5, 4, true);
		System.out.println(jeremy);
		
		interactWithMonster(jeremy);
	}
	 
	private void interactWithMonster(MarshmellowMonster currentMonster) throws InterruptedException
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		int consumed = myScanner.nextInt();
		if(consumed == 0)
		{
			System.out.println("Not hungry? Oh, so sad....");
		}
		else if(consumed < 0)
		{
			System.out.println("What?? You can't eat a negative amount of arms! Stupid human *shakes head slowly*");
		}
		else if(consumed > 10)
		{
			System.out.println("Sorry! I don't have that many eyes for you to eat!");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyecount() - consumed);
			System.out.println("OK, now I only have " + currentMonster.getEyecount() + " left!");
		}
		
		System.out.println(currentMonster.getName() + " is now wondering how many of his tentacles you'd like to eat");
		int eaten = myScanner.nextInt();
		if(eaten == 0)
		{
			System.out.println("You really don't want to eat any of my tentacles? Okay :(");
		}
		else if(eaten < 0)
		{
			System.out.println("You can't eat that amount!! That's not possible!");
		}
		else if(eaten > currentMonster.getTentacleAmount())
		{
			System.out.println("I already told you that I only have " + currentMonster.getTentacleAmount() + " tentacles! What's wrong with you?");
		}
		else
		{
			currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - eaten);
			System.out.println("Alrighty!! Now I only have " + currentMonster.getTentacleAmount() + " tentacle!");
		}
		
		System.out.println(currentMonster.getName() + " would know like to know how many of his arms you wish to devour this fine evening");
		int devoured = myScanner.nextInt();
		if (devoured == 0)
		{
			System.out.println("You're lame :( I was really hoping you'd want to eat some of my arms");
		}
		else if(devoured < 0)
		{
			System.out.println("You're kidding right?");
		}
		else if(devoured > currentMonster.getArmCount())
		{
			System.out.println("I wish you could eat that many, but sadly I only have " + currentMonster.getArmCount() + " arms");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - devoured);
			System.out.println("OW!! It really hurt when you ate those! ");
		}
		System.out.println(currentMonster);
		
		if(currentMonster.getEyecount() == 10 && currentMonster.getArmCount() == 5 && currentMonster.getTentacleAmount() == 4)
		{
			Thread.sleep(3000);
			System.out.println("Wow! You didn't eat anything! You must still be really hungry!");
			Thread.sleep(2500);//2500ms = 2.5s
			System.out.println("Well too bad");
			System.out.println("Seeya loser!");
		}
		else if(currentMonster.getEyecount() == 0 && currentMonster.getArmCount() == 0 && currentMonster.getTentacleAmount() == 0)
		{
			Thread.sleep(3000);
			System.out.println("You ate all of me :,(");
			Thread.sleep(2500);
			System.out.println("Now I'm dead cause of you");
			System.out.println("I hope you're happy");
			Thread.sleep(2500);
			System.out.println("Goodbye");
		}
		
		myScanner.close();
	}
}