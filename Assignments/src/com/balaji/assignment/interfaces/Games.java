package com.balaji.assignment.interfaces;

public class Games {

	public static void main(String[] args) {
		Game bike=new Bike();
		Game bicycle=new BiCycle();
		Game car=new Car();
		Game[] games=new Game[10];
		for (int i = 0; i <10; i++) {
			int random=(int)(Math.random()*3)+1;
			System.out.println(random);
			if(random==1)
				games[i]=car;
			if(random==2)
				games[i]=bike;
			if(random==3)
				games[i]=bicycle;
		}
		for (Game game : games) {
			testGame(game);
		}
		
	}
	public static void testGame(Game game) {
		game.start();
		game.play();
		game.stop();
	}

}
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
}
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
}
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
}
