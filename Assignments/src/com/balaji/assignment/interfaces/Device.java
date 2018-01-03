package com.balaji.assignment.interfaces;

public class Device {

}
class DVD implements RemoteControl{
	@Override
	public boolean powerOnOff() {
		return false;
	}
	@Override
	public int volumeUp(int increment) {
		return 0;
	}
	@Override
	public int volumeDown(int decrement) {
		return 0;
	}
	@Override
	public void mute() {
		
	}
}

class TV implements RemoteControl{
	@Override
	public boolean powerOnOff() {
		
		return true;
	}
	@Override
	public int volumeUp(int increment) {
		return 0;
	}
	@Override
	public int volumeDown(int decrement) {
		return 0;
	}
	@Override
	public void mute() {
		
	}
	
}