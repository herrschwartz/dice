import java.util.Random;

public class Dice {
	
	public Dice(){}

	public int d6(int mod) //mod is for +/- modfiers
	{
		Random gen = new Random();
		int x = gen.nextInt(6);
		x = x+mod;
		return x+1;
	}
	
	public int d8(int mod) //mod is for +/- modfiers
	{
		Random gen = new Random();
		int x = gen.nextInt(8);
		x = x+mod;
		return x+1;
	}
	
	public int d10(int mod) //mod is for +/- modfiers
	{
		Random gen = new Random();
		int x = gen.nextInt(10);
		x = x+mod;
		return x+1;
	}
	
	public int d12(int mod) //mod is for +/- modfiers
	{
		Random gen = new Random();
		int x = gen.nextInt(12);
		x = x+mod;
		return x+1;
	}
	
	public int d20(int mod) //mod is for +/- modfiers
	{
		Random gen = new Random();
		int x = gen.nextInt(20);
		x = x+mod;
		return x+1;
	}
	
	
	
}
