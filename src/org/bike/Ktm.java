package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println(" cost of Ktm is 1.5lakhs ");
	}

	@Override
	public void speed() {
		System.out.println(" speed of Ktm is 40km ");
		
	}
	
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.speed();
		k.cost();
	}

}
