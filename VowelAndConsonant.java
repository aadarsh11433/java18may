package com.aadarsh;

public class VowelAndConsonant {
	
	
	
	 void checker(char a) {
		 
		 if(a == '!'||a=='@' || a =='#' ||a == '$'||a=='%' || a =='^' ||a == '&'||a=='*' || a =='(' ||
				 a == ')'||a=='_' || a =='+' ||a == '='||a=='[' || a ==']' || a == '}'||a=='{' || a =='`' ||
				 a == '1'||a=='2' || a =='3' || a == '4'||a=='5' || a =='6' ||a == '7'||a=='8' || a =='9' ||
				 a =='0') {
			 
			 System.out.println("Invalid character");
			 return;
		 }
		 
		switch(a) {
		
		case 'a':
		case 'e':
		case 'u':
		case 'o':
		case 'i':
		System.out.println("Vowel");
		break;
		
		default: 
			System.out.println("Consonant");
			break;
		
		}
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		VowelAndConsonant obj = new VowelAndConsonant();
		obj.checker('a');
		obj.checker('b');
		obj.checker('+'); // put invalid character
		
		
	}

}
