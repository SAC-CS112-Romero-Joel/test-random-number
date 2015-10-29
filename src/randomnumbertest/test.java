package randomnumbertest;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);	
		
		System.out.println("Odd of Even Game");
		
		int i = 1;
		int compNum= randomnumbertest.RandomNumber.GetaNumber();
		
		while (i <10 )
		{
		
	System.out.print("Guess even or odd 1 for odd and 2 for even you get 10x turns : ");
	int ans = input.nextInt();
	{
	if (ans<1 || ans >11)
	 {
	System.out.println("ERROR INVALID INPUT loss 1 turn");
	 }
	}
	
	
	if (compNum ==1 ||  compNum==3 || compNum==5 || compNum==7  || compNum==9 && ans ==1 ||  ans==3 || ans==5 || ans==7  || ans==9 )
	{System.out.println("we both got Odd ");

	}
	else if (ans ==2 ||  ans==4 || ans==6 || ans==8  || ans==10 && compNum ==1 ||  compNum==3 || compNum==5 || compNum==7  || compNum==9)
	{System.out.println("I got odd you got even");

	}
	else if (ans ==2 ||  ans==4 || ans==6 || ans==8  || ans==10 && compNum ==2 ||  compNum==4 || compNum==6 || compNum==8  || compNum==10)
	{System.out.println("we both got even");

	}
	else if ( ans ==1 ||  ans==3 || ans==5 || ans==7  || ans==9  && compNum ==2 ||  compNum==4 || compNum==6 || compNum==8  || compNum==10 )
	{System.out.println("I got even you got odd");

	}
	i++;
	}
	}
	

}
