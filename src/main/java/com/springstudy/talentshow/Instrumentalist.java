package com.springstudy.talentshow;

public class Instrumentalist implements Performer {
	public Instrumentalist() {
		
	}
	public void perform() {
		// TODO Auto-generated method stub
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}
	
	private String song;

	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	
	private Instrument instrument;
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
}
