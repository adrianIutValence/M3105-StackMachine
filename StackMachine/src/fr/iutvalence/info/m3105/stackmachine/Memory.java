package fr.iutvalence.info.m3105.stackmachine;

public class Memory {

	private int end;
	private int start;

	public Memory(int start, int end) throws InvalidParametersException {
		if(start <0 || end<0 || start < end)
			throw new InvalidParametersException();
		this.start = start;
		this.end = end;
	}

	public int getStartAddress() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void write(int currentAddress, Object opCode) {
		// TODO Auto-generated method stub
		
	}

}
