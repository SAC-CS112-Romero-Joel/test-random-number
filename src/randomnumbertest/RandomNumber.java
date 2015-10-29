package randomnumbertest;

import java.util.Scanner;

public class RandomNumber {

	public void displaymessage() {
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Odd of Even Game");
		
		int i = 1;
		int compNum;
		
		while (i <10 )
		{
		int gamenum = 1 + (int) (Math.random() *2);
		compNum = gamenum;
	System.out.print("Guess even or odd 1 for odd and 2 for even you get 10x turns");
	int ans = input.nextInt();

	if (ans<1 || ans >2)
	 {
	System.out.println("ERROR INVALID INPUT loss 1 turn");
	 }

	else if (ans ==1 && gamenum ==1 )
	{System.out.println("Odd correct");

	}
	else if (ans ==1 && gamenum ==2)
	{System.out.println("I got odd you got even");

	}
	else if (ans==2 && gamenum ==2)
	{System.out.println("we both got even");

	}
	else if (ans==2 && gamenum == 1)
	{System.out.println("I got odd you got even");

	}
	i++;
	}
		
	}
	
	
}
