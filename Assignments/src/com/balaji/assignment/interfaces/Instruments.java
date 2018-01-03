package com.balaji.assignment.interfaces;

public class Instruments {
	public static void main(String[] args) {
		Instrument piano=new Piano();
		Instrument flute=new Flute();
		Instrument guitar=new Guitar();
		Instrument[] instruments= {piano,flute,guitar,piano,flute,guitar,piano,flute,guitar,piano};
		for (Instrument instrument : instruments) {
			testInstrument(instrument);
		}

	}
	public static void testInstrument(Instrument instrument) {
		instrument.play();
	}
}
class Piano implements Instrument{
	@Override
	public void play() {
		System.out.println("Piano is playing pee peee peee");
	}
}
class Flute implements Instrument{
	@Override
	public void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}
}
class Guitar implements Instrument{
	@Override
	public void play() {
		System.out.println("Guitar is playing tin tin tin tin");
	}
}
