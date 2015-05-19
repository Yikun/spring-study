package com.springstudy.talentshow;

import java.util.Collection;

public class SuperInstrumentalist implements Performer {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		for(Instrument ins : instruments) {
			ins.play();
		}
	}
	
	private Collection<Instrument> instruments;
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

}
