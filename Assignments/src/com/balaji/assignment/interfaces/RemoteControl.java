package com.balaji.assignment.interfaces;

public interface RemoteControl {
	int MIN_SOUND=0;
	int MAX_SOUND=50;
	boolean powerOnOff(); // Returns new state, on = true
	int volumeUp(int increment); // Returns new volume level
	int volumeDown(int decrement); // Returns new volume level
	void mute(); // Mutes sound output
}
