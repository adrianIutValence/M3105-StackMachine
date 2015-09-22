package fr.iutvalence.info.m3105.stackmachine;

import java.util.Vector;

public class Stack{
	private Vector<Byte> stack;
	
	public Stack(int size) throws InvalidParametersException {
		this.stack = new Vector<Byte>(size);
	}
}
