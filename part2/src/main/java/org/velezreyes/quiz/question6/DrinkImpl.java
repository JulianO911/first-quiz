package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink{
	
	private String name; //Name of the drink
	private int prize; //Cost of the drink in cents
	private boolean fizzy; //If is true, it means is fizzy. Otherwise, false
	
	public DrinkImpl(String name,int prize, boolean fizzy) {
		this.name = name;
		this.prize = prize;
		this.fizzy = fizzy;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isFizzy() {
		// TODO Auto-generated method stub
		return fizzy;
	}
	
	public int getPrize() {
		return prize;
	}

}
