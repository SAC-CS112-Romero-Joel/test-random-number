package randomnumbertest;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static int GetaNumber() 
	{
		
	Random rand = new Random();
	return rand.nextInt(10) + 1;
	}
	public int GetaNumber (int high)
	{
		Random rand = new Random();
		return rand.nextInt(high + 1);
	}
	
	public int GetaNumber (int lo,int high)
	{
		Random rand = new Random();
		return rand.nextInt(high-lo + 1)+ lo;
	}
		
	}
	

