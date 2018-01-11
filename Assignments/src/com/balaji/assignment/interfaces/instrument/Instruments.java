package com.balaji.assignment.interfaces.instrument;

/**
 * 
 * @author spaneos
 *
 */
public class Instruments {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		System.out.println("Testing polymorphic code ");
		int index=0;
		Instrument piano=new Piano();
		Instrument flute=new Flute();
		Instrument guitar=new Guitar();
		Instrument[] instruments= {piano,flute,guitar,piano,flute,guitar,piano,flute,guitar,piano};
		for (Instrument instrument : instruments) {
			System.out.println("Instrument No : "+ ++index);
			System.out.println("Instrument Name : "+instrument);
			testInstrument(instrument);
		}

	}
	/**
	 * Polymorphic code
	 * @param instrument input value
	 */
	public static void testInstrument(Instrument instrument) {
		instrument.play();
	}
}
/**
 * 
 * @author spaneos
 *
 */
class Piano implements Instrument{
	
	@Override
	public void play() {
		System.out.println("Piano is playing pee peee peee");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Piano";
	}
	
	
}
/**
 * 
 * @author spaneos
 *
 */
class Flute implements Instrument{
	@Override
	public void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Flute";
	}
	
	
}
/**
 * 
 * @author spaneos
 *
 */
class Guitar implements Instrument{
	@Override
	public void play() {
		System.out.println("Guitar is playing tin tin tin tin");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Guitar";
	}
	
	
}
