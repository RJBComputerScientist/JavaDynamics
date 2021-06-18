package com.example.model;

public interface Swimmer {
	int NUMBER_OF_FEET_IN_A_LEAGUE = 18_228;
	void swim();
//	void dive();
	//^^^making a default for 
	default void dive() {
		System.out.println("Diving");
	}
	static int convertFromFeetToLeagues(int feet) {
		return feet/NUMBER_OF_FEET_IN_A_LEAGUE;
	}
}
