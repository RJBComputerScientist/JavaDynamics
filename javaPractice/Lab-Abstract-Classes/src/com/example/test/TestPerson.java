package com.example.test;
import com.example.Person;
import com.example.Developer;
public class TestPerson {
	public static void main(String[] args) {
//		Person Ryan = new Person();
		Person Ryan = new Developer();
		Ryan.setName("Ryan");
		System.out.println(Ryan.getName());
	}
}
