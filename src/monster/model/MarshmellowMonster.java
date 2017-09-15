package monster.model;

public class MarshmellowMonster
{
	//Declaration section of data members
	
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmellowMonster()
	{
		//initializes everything to 0, false or null.
	}
	
	public MarshmellowMonster(String name, int eyeCount, int armCount, int tentacleAmount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = armCount;
		this.tentacleAmount = tentacleAmount;
		this.hasBloop = hasBloop;
	}
	
	public String toString()
	{
		String description = "I am a monster, my name is " + name + ", I have " + eyeCount + " eyes and only ";
		description += tentacleAmount + " tentacles, but I have " + armCount + " arms!" + hasBloop + " tells you";
		description += " if I have a bloop";
		return description;
	}
}
