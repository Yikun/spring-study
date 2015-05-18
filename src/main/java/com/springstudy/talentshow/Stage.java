package com.springstudy.talentshow;

public class Stage {
	private Stage() {
	}
	
	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
	
	public void show() {
		System.out.println("Light, music，curtain are ready...");
	}
	
	public void turnOnLights() {
		System.out.println("Turn on Lights...");
	}
	
	public void turnOffLights() {
		System.out.println("Turn off Lights...");
	}
}
