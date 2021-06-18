package com.example.exceptions;

import java.util.*;

public class Simulation {
	public static void main(String[] args) {
//		getInput();
		try {
			getInput();
		} catch(EvenNumberException e) {
			e.printStackTrace();
		}
	}
	
	public static void getInput() throws EvenNumberException{
		Scanner in = new Scanner(System.in);
		
		//get input from user
		System.out.println("Type in a number and press enter...");
		String line = in.nextLine();	
		System.out.println("You've typed: " + line);
		//test if number is even, throw exception if true
		if(isEven(line)) {
			try {				
				throw new EvenNumberException();
			} catch (EvenNumberException e) {
				e.printStackTrace();
			} finally {
				in.close();
			}
			/*
			 * You don't need a catch-block to use a try-block, 
			 * however, you cannot have a try-block without 
			 * either a catch-block or a finally-block.
			 */
		}
		//close resources
		in.close();
		}
	
	public static boolean isEven(String num) {
		//convert value to a number
		int value = Integer.parseInt(num);
		return (value % 2 == 0);
	}
}
