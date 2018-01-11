package com.balaji.assignment.interfaces.game;

/**
 * 
 * @author spaneos
 *
 */
public class Games {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		System.out.println("Testing polymorphic code based on random numbers");
		Game bike=new Bike();
		Game bicycle=new BiCycle();
		Game car=new Car();
		Game[] games=new Game[10];
		for (int i = 0; i <10; i++) {
			int random=(int)(Math.random()*3)+1;
			if(random==1)
				games[i]=car;
			if(random==2)
				games[i]=bike;
			if(random==3)
				games[i]=bicycle;
		}
		for (Game game : games) {
			System.out.println("Vehicle : "+game);
			testGame(game);
			System.out.println("-----------------");
		}
		
	}
	/**
	 * Polymorphic code
	 * @param game input value
	 */
	public static void testGame(Game game) {
		game.start();
		game.play();
		game.stop();
	}

}
/**
 * 
 * @author spaneos
 *
 */
class Bike implements Game{
	@Override
	public void start() {
		System.out.println("Bike is starting");
	}
	@Override
	public void play() {
		System.out.println("Bike is runing");
	}
	@Override
	public void stop() {
		System.out.println("Bike stopped");
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bike";
	}
	
	
}
/**
 * 
 * @author spaneos
 *
 */
class BiCycle implements Game{
	@Override
	public void start() {
		System.out.println("Bicycle is starting");
		
	}
	@Override
	public void play() {
		System.out.println("Bicycle is runing");
		
	}
	@Override
	public void stop() {
		System.out.println("Bicycle stopped");
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BiCycle";
	}
	
	
}
/**
 * 
 * @author spaneos
 *
 */
class Car implements Game{
	@Override
	public void start() {
		System.out.println("Car is starting");
		
	}
	@Override
	public void play() {
		System.out.println("Car is runing");
		
	}
	@Override
	public void stop() {
		System.out.println("Car stopped");
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car";
	}
	
	
}
