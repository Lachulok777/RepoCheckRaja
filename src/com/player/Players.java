package com.player;

public class Players {

	public static void main(String[] args) {
		int s= calculateHighscorePosition(1500);
		displayHighscorePosition("ilakki", s);
		s= calculateHighscorePosition(900);
		displayHighscorePosition("sibi", s);
		s= calculateHighscorePosition(500);
		displayHighscorePosition("mari", s);
		s= calculateHighscorePosition(100);
		displayHighscorePosition("raja", s);
		
	}
	public static void displayHighscorePosition(String name, int position)
	{
		System.out.println(name+" managed to get into position "+ position+" on the high score table ");
	}
	
	public static int calculateHighscorePosition(int score )
	{
		if (score > 1000)
			return 1;
		else if(score >500 && score < 1000)
			return 2;
		else if(score>100 && score<=500)
			return 3;
		else
			return 4;
	}
}

