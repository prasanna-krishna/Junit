package com.mycompany.main;

public class Calculator {
	
	public int sum(int a,int b)
	{
		return a + b;
	}
	
	public int countA(String word)
	{
		int count = 0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i) == 'a' || word.charAt(i) == 'A')
			{
				count++;
			}
		}
		
		return count;
	}

}
