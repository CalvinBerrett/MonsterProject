package monster.controller;

import monster.model.MarshmellowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController
{
	private MonsterDisplay popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	
	public void start() throws InterruptedException
	{
		MarshmellowMonster basic = new MarshmellowMonster();
//		popup.displayText(basic.toString());
		MarshmellowMonster jeremy = new MarshmellowMonster("Jeremy The Great", 10, 5, 4, true);
//		System.out.println(jeremy);
		popup.displayText(jeremy.toString());
		
		interactWithMonster(jeremy);
	}
	 
	private void interactWithMonster(MarshmellowMonster currentMonster) throws InterruptedException
	{
//		Scanner myScanner = new Scanner(System.in);
//		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
//		popup.getResponse(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		int consumed = 0;
		String response = popup.getResponse(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		if(isValidInteger(response))
		{
			consumed = Integer.parseInt(response);
		}
		
		if(consumed == 0)
		{
//			System.out.println("Not hungry? Oh, so sad....");
			popup.displayText("Not hungry? Oh, so sad....");
		}
		else if(consumed < 0)
		{
//			System.out.println("What?? You can't eat a negative amount of arms! Stupid human *shakes head slowly*");
			popup.displayText("What?? You can't eat a negative amount of arms! Stupid human *shakes head slowly*");
		}
		else if(consumed > 10)
		{
//			System.out.println("Sorry! I don't have that many eyes for you to eat!");
			popup.displayText("Sorry! I don't have that many eyes for you to eat!");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyecount() - consumed);
//			System.out.println("OK, now I only have " + currentMonster.getEyecount() + " left!");
			popup.displayText("OK, now I only have " + currentMonster.getEyecount() + " left!");
		}
		
//		System.out.println(currentMonster.getName() + " is now wondering how many of his tentacles you'd like to eat");
		int eaten = 0;
		// Instead of "String response#" you can just do "response"
		String response2 = popup.getResponse(currentMonster.getName() + " is now wondering how many of his tentacles you'd like to eat");
		if(isValidInteger(response2))
		{
			eaten = Integer.parseInt(response2);
		}
		
		if(eaten == 0)
		{
//			System.out.println("You really don't want to eat any of my tentacles? Okay :(");
			popup.displayText("You really don't want to eat any of my tentacles? Okay :(");
		}
		else if(eaten < 0)
		{
//			System.out.println("You can't eat that amount!! That's not possible!");
			popup.displayText("You can't eat that amount!! That's not possible!");
		}
		else if(eaten > currentMonster.getTentacleAmount())
		{
//			System.out.println("I already told you that I only have " + currentMonster.getTentacleAmount() + " tentacles! What's wrong with you?");
			popup.displayText("I already told you that I only have " + currentMonster.getTentacleAmount() + " tentacles! What's wrong with you?");
		}
		else
		{
			currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - eaten);
//			System.out.println("Alrighty!! Now I only have \" + currentMonster.getTentacleAmount() + " tentacle!");
			popup.displayText("Alrighty!! Now I only have " + currentMonster.getTentacleAmount() + " tentacles!");
		}
		
//		System.out.println(currentMonster.getName() + " would know like to know how many of his arms you wish to devour this fine evening");
		int devoured = 0;
		String response3 = popup.getResponse(currentMonster.getName() + " would know like to know how many of his arms you wish to devour this fine evening");
		if(isValidInteger(response3))
		{
			devoured = Integer.parseInt(response3);
		}
		
		if (devoured == 0)
		{
//			System.out.println("You're lame :( I was really hoping you'd want to eat some of my arms");
			popup.displayText("You're lame :( I was really hoping you'd want to eat some of my arms");
		}
		else if(devoured < 0)
		{
//			System.out.println("You're kidding right?");
			popup.displayText("You're kidding right?");
		}
		else if(devoured > currentMonster.getArmCount())
		{
//			System.out.println("I wish you could eat that many, but sadly I only have " + currentMonster.getArmCount() + " arms");
			popup.displayText("I wish you could eat that many, but sadly I only have " + currentMonster.getArmCount() + " arms");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - devoured);
//			System.out.println("OW!! It really hurt when you ate those!");
			popup.displayText("OW!! It really hurt when you ate those!");
		}
//		System.out.println(currentMonster);
		popup.displayText(currentMonster.toString());
		
		if(currentMonster.getEyecount() == 10 && currentMonster.getArmCount() == 5 && currentMonster.getTentacleAmount() == 4)
		{
			Thread.sleep(3000);
//			System.out.println("Wow! You didn't eat anything! You must still be really hungry!");
			popup.displayText("Wow! You didn't eat anything! You must still be really hungry!");
			Thread.sleep(2500);//2500ms = 2.5s
//			System.out.println("Well too bad");
			popup.displayText("Well too bad");
			Thread.sleep(1000);
//			System.out.println("Seeya loser!");
			popup.displayText("Seeya loser!");
		}
		else if(currentMonster.getEyecount() == 0 && currentMonster.getArmCount() == 0 && currentMonster.getTentacleAmount() == 0)
		{
			Thread.sleep(3000);
//			System.out.println("You ate all of me :,(");
			popup.displayText("You ate all of me :,(");
			Thread.sleep(2500);
//			System.out.println("Now I'm dead cause of you");
			popup.displayText("Now I'm dead cause of you");
			Thread.sleep(1000);
//			System.out.println("I hope you're happy");
			popup.displayText("I hope you're happy");
			Thread.sleep(2500);
//			System.out.println("Goodbye");
			popup.displayText("Goodbye");
		}
		
//		popup.displayText("Hi there, ready to play??");
//		String answer = popup.getResponse("What is the air speed of a coconut laden swallow?");
//		System.out.println(answer);
		
//		myScanner.close();
	}

	//Helper methods
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error) 
		{
			popup.displayText("You need to input an int. " + "'" +  sample + "'" + " is not valid.");
		}
		
		return valid;
	}
	
	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to type in a double. " + "'" + sampleDouble + "'" + "is not valid answer.");
		}
		
		return valid;
	}
	
	private boolean isValidBoolean(String sampleBoolean)
	{
		boolean valid = false;
		
		try
		{
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to type in a boolean. " + "'" + sampleBoolean + "'" + "does not count.");
		}
		
		return valid;
	}
}
