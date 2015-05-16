package com.springstudy.talentshow;

public class TranquilNight implements Poem {
	private static String[] LINES = {
		"床前明月光，",
		"疑似地上霜。",
		"举头望明月，",
		"低头思故乡。"
	};
	
	public TranquilNight() {
	}
	
	public void recite() {
		for(int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}
	}
}
