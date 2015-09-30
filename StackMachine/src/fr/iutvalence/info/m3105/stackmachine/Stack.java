package fr.iutvalence.info.m3105.stackmachine;

import java.util.Vector;

public class Stack{
	private Vector<Byte> stack;
	
	public Stack(int size) throws InvalidParametersException {
		if (size < 0)
			throw new InvalidParametersException();
		this.stack = new Vector<Byte>(size);
	}
	
	public Byte pop(){
		return this.stack.remove(0);
	}
	
	public void clear(){
		this.stack.clear();
	}
}
