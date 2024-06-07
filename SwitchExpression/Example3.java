package com.SwitchExpression;

public class Example3 {

	public static void main(String[] args) {
		
		byte value = 'b';
		
		String output= switch(value) {
		
		case 'B' , 'C', 'D', 'R', 'b', 'c' -> "Consonant";
		
		case 'a', 'e', 'i', 'o', 'u' -> "vowels";
		
		default -> "enter the valid character";
		
		
		
		};
		
		System.out.println(output);

	}

}
