package com.example.exceptions;

public class EvenNumberException extends Exception {
	@Override
	public String getMessage() { //Has to be "getMessage" as a class name
		return "You cannot input an even number";
	}
}
