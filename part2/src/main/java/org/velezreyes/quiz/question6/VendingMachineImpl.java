package org.velezreyes.quiz.question6;

import java.util.ArrayList;

public class VendingMachineImpl implements VendingMachine {
	
	public static int currentMoney = 0; //Money that is currently inserted on the bending machine
	private ArrayList<Drink> drinks = new ArrayList<>(); //Drinks the bending machine has

	public VendingMachineImpl() {
		this.drinks.add(new DrinkImpl("ScottCola",75,true));
		this.drinks.add(new DrinkImpl("KarenTea",100,false)); //When a bending machine is created, it has two drinks by default
	}

	public static VendingMachine getInstance() {
		return new VendingMachineImpl();
	}
	  
	@Override
	public void insertQuarter() {
		VendingMachineImpl.currentMoney += 25;	
	}
	
	@Override
	
	/*The method verifies if the drink name is in the machine (if is not, throws the UnknownDrinkException).
	 Then, verifies if the current money is enough to buy the drink according to its price; if it is, return
	 the drink, otherwise, throws the NotEnoughMoneyException.  */
	
	// NOTE: Exchange function can be implemented, but is not necessary to this exercise.
	public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
		for(Drink drink:this.drinks) {
			if(drink.getName() == name) {
				if(VendingMachineImpl.currentMoney >=  drink.getPrize() ) {
					VendingMachineImpl.currentMoney = 0;	
					return drink;
				}
				else {
					throw new NotEnoughMoneyException();
				}
			}
		}
		throw new UnknownDrinkException();
		
	}
	
	public ArrayList<Drink> getDrinks() {
		return drinks;
	}
	
	public void addNewDrinks(Drink drink) {
		this.drinks.add(drink);
	}
}
