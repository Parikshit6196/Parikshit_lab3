package Balancing_bracket;

import java.util.Stack;

public class BalabcingBrackets {
	
	public static boolean areBalanced (String bracketExp) 
{
		Stack<Character> bracketStk = new Stack<Character>();
		
		for(int i=0; i<= bracketExp.length();i++) 
		{
			char x = bracketExp.charAt(i);
			if(x == '(' || x == '[' || x == '{' ) 
			{
				bracketStk.push(x);
				continue;
			}
			
			if(bracketStk.isEmpty())
			   return false;
			 char check;
			 switch(x) {
			 case ')' :
				 check = bracketStk.pop();
				 if(check == '{' || check == '[')
					 return false;
				 break;
				 
			 case '}' :
				 check = bracketStk.pop();
				 if(check == '(' || check == '[')
					 return false;
				 break;
				 
			 case ']' :
				 check = bracketStk.pop();
				 if(check == '(' || check == '{')
					 return false;
				 break;
			 }
		}
		return bracketStk.isEmpty();	
	}
}
