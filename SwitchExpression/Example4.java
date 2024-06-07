package com.SwitchExpression;

public class Example4 {

	public static void main(String[] args) {
		
		int value = '1';
		
		String output = switch(value) {
		
		case 1 -> "monday";
		case 2 -> "tuesday";
		
		default -> "enter valid number";
		};
		
		System.out.println(output);

	}

}
