package org.phone;

public class InternalStorage {

	public void processorName() {
		
		System.out.println("Processor Name:");
		
	}
	
	public void ramSize() {
		
		System.out.println("RAM Size:");
		
	}
	
	public static void main(String[] args) {
		
		InternalStorage i = new InternalStorage();
		i.processorName();
		i.ramSize();
		
		ExternalStorage e = new ExternalStorage();
		e.size();
	}
}
