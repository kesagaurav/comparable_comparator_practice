package com.gauav;

public class GroceryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grocery g=new Grocery();
		g.addGroceryList("milk");
		g.addGroceryList("butter");
		g.addGroceryList("cheese");
		g.printGroceryList();
		System.out.println("\n the removed items in grocery list are");

	//	g.removeAnItem();
		//g.printGroceryList();
		g.modifyItem(1, "ghee");
		g.printGroceryList();
		System.out.println("\n the serach item in the list are");
		g.findItem("ghee");

	}

}
