package com.SwitchExpression;

public class Example1 {
public static void main(String[] args) {
	
	String day="saturday";
	
	switch(day.toLowerCase())
	{
	case "monday":
	case "tuesday":
	case "wednsday":
	case "thusday":
	case "friday":
		System.out.println("Working day");
		break;
		
	case "saturday":
	case "sunday":
		System.out.println("holiday");
}
}
}