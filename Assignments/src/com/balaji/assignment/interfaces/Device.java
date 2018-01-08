package com.balaji.assignment.interfaces;

import java.util.Scanner;
/**
 * 
 * @author spaneos
 *
 */
public class Device {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int ch=0;
		boolean flag=true;
		DVD dvd=new DVD();
		TV tv=new TV();
		while(flag) {
			System.out.println("Enter 1 to operate TV");
			System.out.println("Enter 2 to operate DVD");
			System.out.println("Enter 3 to exit");
			Scanner sc=new Scanner(System.in);
			if(sc.hasNextInt()) {
				ch=sc.nextInt();
				flag=false;
			}
			else {
				System.err.println("Enter only numbers");
				flag=true;
				continue;
			}
			switch (ch) {
			case 1:
				TestDevice(tv);
				flag=true;
				break;

			case 2:
				TestDevice(dvd);
				flag=true;
				break;

			case 3:
				System.out.println("Thank you!!!");
				flag=false;
				break;

			default:
				System.err.println("Enter only 1 to 3");
				flag=true;
				break;
			}
		}
	}
	/**
	 * 
	 * @param device
	 */
	public static void TestDevice(RemoteControl device) {
		Scanner sc1=new Scanner(System.in);
		boolean menuFlag=true;
		int key=0;
		while(menuFlag) {
			System.out.println("press 1 to power on/power off");
			System.out.println("press 2 to increase volume");
			System.out.println("press 3 to decrease volume");
			System.out.println("press 4 to mute");
			System.out.println("Enter 5 to exit");
			System.out.println("Enter your choice");
			sc1=new Scanner(System.in);
			if(sc1.hasNextInt()) {
				key=sc1.nextInt();
				menuFlag=false;
			}
			else {
				System.err.println("Enter only numbers");
				menuFlag=true;
				continue;
			}
			switch (key) {
			case 1:
				boolean state=device.powerOnOff();
				System.out.print(device+" is switched ");
				System.out.println((state)?"ON":"OFF");
				menuFlag=true;
				break;
			case 2:
				boolean flag=true;
				while(flag) {
					System.out.println("Enter the volume level");
					sc1=new Scanner(System.in);
					if(sc1.hasNextInt()) {
						int increment=sc1.nextInt();
						int vol=device.volumeUp(increment);
						if(vol!=-1)
							System.out.println("The volume is "+ vol);
						flag=false;
					}
					else {
						System.err.println("Enter only nos");
						flag=true;
					}
				}
				menuFlag=true;
				break;	
			case 3:
				flag=true;
				while(flag) {
					System.out.println("Enter the volume level");
					sc1=new Scanner(System.in);
					if(sc1.hasNextInt()) {
						int decrement=sc1.nextInt();
						int vol=device.volumeDown(decrement);
						if(vol!=-1)
							System.out.println("The volume is "+ vol);
						flag=false;
					}
					else {
						System.err.println("Enter only nos");
						flag=true;
					}
				}
				menuFlag=true;
				break;
			case 4:
				device.mute();
				menuFlag=true;
				break;
			case 5:
				System.out.println("Exiting the menu");
				menuFlag=false;
				break;
			default:
				System.err.println("Enter only 1 to 4");
				menuFlag=true;
				break;
			}
		}
	}
}
/**
 * 
 * @author spaneos
 *
 */
class DVD implements RemoteControl{
	private boolean state;
	private int volume;

	/**
	 * 
	 */
	public DVD() {
		this.state=false;
		this.volume=MIN_SOUND;

	}
	@Override
	public boolean powerOnOff() {
		state=!state;
		return state;
	}
	@Override
	public int volumeUp(int increment) {
		if (state) {
			if(increment>=MIN_SOUND && increment<=MAX_SOUND) {
				if(increment>=volume) {
					this.volume=increment;
					return volume;
				}
				else {
					System.err.println("Already the volume is "+volume+" Enter the value higher than "+volume
							+" to increase");
					return -1;
				}
			}
			else {
				System.err.println("The volume is out of range (Range 0-50)");
				return -1;
			}
		}
		else {
			System.err.println("Dvd is not switched on.");
			return -1;
		}

	}
	
	@Override
	public int volumeDown(int decrement) {
		if (state) {
			if(decrement>=MIN_SOUND && decrement<=MAX_SOUND) {
				if(decrement<=volume) {
					this.volume=decrement;
					return volume;
				}
				else {
					System.err.println("Already the volume is "+volume+" Enter the value lower than "+volume
							+" to decrese");
					return -1;
				}

			}
			else {
				System.err.println("The volume is out of range (Range 0-50)");
				return -1;
			}
		}
		else {
			System.err.println("Dvd is not switched on");
			return -1;
		}
	}
	@Override
	public void mute() {
		if (state) {
			System.out.println("The DVD volume is muted.");
		}
		else {
			System.err.println("DVD is switched off. power on first and then mute");
		}	}
	@Override
	public String toString() {
		return "DVD";
	}

}
/**
 * 
 * @author spaneos
 *
 */
class TV implements RemoteControl{
	private boolean state;
	private int volume;



	public TV() {
		this.state=false;
		this.volume=MIN_SOUND;
	}
	@Override
	public boolean powerOnOff() {
		this.state=!state;
		return state;
	}
	@Override
	public int volumeUp(int increment) {
		if (state) {
			if(increment>=MIN_SOUND && increment<=MAX_SOUND) {
				if(increment>=volume) {
					this.volume=increment;
					return volume;
				}
				else {
					System.err.println("Already the volume is "+volume+" Enter the value higher than "+volume
							+" to increase");
					return -1;
				}
			}
			else {
				System.err.println("The volume is out of range (Range 0-50)");
				return -1;
			}
		}
		else {
			System.err.println("TV is not switched on.");
			return -1;
		}
	}
	@Override
	public int volumeDown(int decrement) {
		if (state) {
			if(decrement>=MIN_SOUND && decrement<=MAX_SOUND) {
				if(decrement<=volume) {
					this.volume=decrement;
					return volume;
				}
				else {
					System.err.println("Already the volume is "+volume+" Enter the value lower than "+volume
							+" to decrese");
					return -1;
				}
			}
			else {
				System.err.println("The volume is out of range (Range 0-50)");
				return -1;
			}
		}
		else {
			System.err.println("TV is not switched on");
			return -1;
		}	}
	@Override
	public void mute() {
		if (state) {
			System.out.println("The TV volume is muted.");
		}
		else {
			System.err.println("TV is switched off. power on first and then mute");
		}
	}
	@Override
	public String toString() {
		return "TV";
	}

}