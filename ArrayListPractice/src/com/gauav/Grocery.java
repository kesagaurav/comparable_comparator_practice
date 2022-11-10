package com.gauav;

import java.util.ArrayList;

public class Grocery {

 static	ArrayList<String> groceryList=new ArrayList<>();
	
	public void addGroceryList(String item) {
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("\n the grocery list items are " + groceryList.size());
		for(int i=0;i<groceryList.size();i++) {
			System.out.println(" teh values in grocery list are " + groceryList.get(i));
		}
	}
	
	public void modifyItem(int position,String item) {
		
			System.out.println(groceryList.set(position, item));
		
	}
	
	public void removeAnItem() {
		for(int i=0;i<groceryList.size();i++) {
			System.out.println(groceryList.remove(i));
		}
	}
	
	
	public  String findItem(String item) {
//		for(int j=0;j<groceryList.size();j++) {
//			if(groceryList.contains(j)) {
//				System.out.println("\n item found in the list " + groceryList.get(j));
//			}
//			System.out.println("\n item not found " + groceryList.get(j));
//
//		}
//		
		
		int position=groceryList.indexOf(item);
		if(position!=-1 || position>=0) {
		 return	groceryList.get(position);
		}
	
		return null;
	}
	
}
