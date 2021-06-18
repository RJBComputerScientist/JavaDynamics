package com.Ryan.model;

public class Simulation {
	public static void main(String[] args) {
		FlyingVehicle fv = new FlyingVehicle((short)4, new Engine());
		fv.setName("A New Flying Vehicle");
		System.out.println(fv.getName());
//		Airplane boeing = new Airplane();
		//^^ without default values
//		Airplane boeing = new Airplane(4, 5);
		//^^ with default values .. ^^ need to cast short .. int is by default
		Airplane boeing = new Airplane((short)4, (short)5);
		//with  default values .. casted to short to fit short values
		boeing.move(15);
		
	}
}
