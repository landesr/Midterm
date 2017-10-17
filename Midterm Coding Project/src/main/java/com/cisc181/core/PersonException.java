package com.cisc181.core;



public class PersonException extends Exception{
	
	private Person person;

	public PersonException(Person p) {
		super();
		this.person = p;
	}

	protected Person getP() {
		return person;
	}
}
