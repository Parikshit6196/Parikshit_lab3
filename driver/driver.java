package driver;

import Balancing_bracket.BalabcingBrackets;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bracketExp = "({[]})";
	 boolean areBalanced =  BalabcingBrackets.areBalanced(bracketExp);
		if(areBalanced) {
			System.out.println("Balanced");
		}
		else 
		{
			System.out.print("Not balanced");
		}	
	}	
}
