package com.balaji.assignment.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.balaji.assignment.utill.UserInputValidations;

public class Club {
	public static void main(String[] args) {
		List footBall=new ArrayList<Player>();
		List cricket=new ArrayList<Player>();
		Player player1=new Player("John", "john.s@gmail.com", "Bengaluru", "Karnataka", 19);
		Player player2=new Player("Sheela", "sheela.k@gmail.com", "Bengaluru", "Karnataka", 22);
		Player player3=new Player("Wilson", "wilson.s@gmail.com", "Chennai", "Tamilnadu", 25);
		Player player4=new Player("Karthik", "karthik.k@gmail.com", "Bengaluru", "Karnataka", 18);
		Player player5=new Player("Deepthi", "deepthi.h@gmail.com", "Bengaluru", "Karnataka", 24);
		Player player6=new Player("Sauraub", "Sauraub.m@gmail.com", "Champaran", "Bihar", 20);
		Player player7=new Player("Vetri", "vetri.b@gmail.com", "Madurai", "Tamilnadu", 19);
		Player player8=new Player("Sindhu", "sindhu.s@gmail.com", "Hyderabad", "Telungana", 23);
		Player player9=new Player("Sneha", "sneha.l@gmail.com", "Bengaluru", "Karnataka", 20);
		footBall.add(player1);
		footBall.add(player2);
		footBall.add(player6);
		footBall.add(player8);
		footBall.add(player5);
		footBall.add(player4);
		footBall.add(player7);
		cricket.add(player9);
		cricket.add(player3);
		cricket.add(player1);
		cricket.add(player4);
		cricket.add(player5);
		cricket.add(player7);
		int ch=0;
		boolean flag=true;
		while (flag) {
			System.out.println("Enter 1 to see players playing football");
			System.out.println("Enter 2 to see players playing cricket");
			System.out.println("Enter 3 to see players playing both games");
			System.out.println("Enter 4 to exit");
			ch=UserInputValidations.validateInteger();
			switch (ch) {
			case 1:
				footBall.forEach(Player->System.out.println(Player));
				flag=true;
				break;
			case 2:
				cricket.forEach(Player->System.out.println(Player));
				flag=true;
				break;
			case 3:
				List<Player> list=getMultiGamePlayers(footBall, cricket);
				list.forEach(Player-> System.out.println(Player));
				flag=true;
				break;
			case 4:
				System.out.println("Thank you!!!");
				flag=false;
				break;
			default:
				System.out.println("Enter only 1 to 4");
				flag=true;
				break;
			}

		}
	}
	public static List<Player> getMultiGamePlayers(List<Player> football, List<Player> cricket){
		List list=new ArrayList<Player>();
		Set  set1 = new HashSet<Player>(cricket);
		Set  set2 = new HashSet<Player>();
		football.forEach(Player->{
			if(!(set1.add(Player))) {
				set2.add(Player);
			}
		});
		list.addAll(set2);
		return list;
	}
}
