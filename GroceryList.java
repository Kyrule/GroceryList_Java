package net.groceries;
import java.util.ArrayList;
import java.util.Scanner;
public class GroceryList {
	/**
	 * @param args
	 */
	private static ArrayList<String> groceryList = new ArrayList();
	private static String lookingForItem=null;
	private static Scanner scan=new Scanner(System.in);
	private static void searchList(){
		System.out.print("Looking for: ");
		lookingForItem=scan.nextLine().toLowerCase();
		if(groceryList.contains(lookingForItem)){
			System.out.println("Item is in the list.");
		}
		else{
			groceryList.add(lookingForItem);
		}
	}
	private static boolean continueSearch(){
		String proceed="y";
		System.out.print("Again? (y/n) ");
		proceed=scan.nextLine();
		if(proceed.equalsIgnoreCase("y"))
			return true;
		return false;
	}
	private static void displayList(){
		System.out.println("\nTHE LIST: ");
		for(String s:groceryList) System.out.println(s);
	}
	public static void main(String[] args) {		
		for(int i=1;i<=5;++i){
			System.out.print("Enter item "+i+": ");
			groceryList.add(scan.nextLine().toLowerCase());
		}
		do{ searchList();}while(continueSearch());		
		displayList();
	}	

}
