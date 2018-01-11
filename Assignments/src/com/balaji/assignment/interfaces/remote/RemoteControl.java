package com.balaji.assignment.interfaces.remote;
/**
 * 
 * @author spaneos
 *
 */
public interface RemoteControl {
	int MIN_SOUND=0;
	int MAX_SOUND=50;
	boolean powerOnOff(); 
	int volumeUp(int increment); 
	int volumeDown(int decrement); 
	void mute(); 
}
