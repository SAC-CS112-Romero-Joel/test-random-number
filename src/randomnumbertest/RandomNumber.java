package randomnumbertest;

import java.util.Scanner;

public class RandomNumber {

	public static int GetaNumber() 
	{
		
		int gamenum = 1 + (int) (Math.random() *10);
		return gamenum;
	}
	public int GetaNumber (int high)
	{
		int gamenum = 1 + (int) (Math.random() *10);
		return gamenum;
	}
	
}
