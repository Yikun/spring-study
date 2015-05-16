package com.springstudy.talentshow;

public class JumpRoper implements Performer {
	private int times = 200;

	public JumpRoper() {
	}

	public JumpRoper(int times) {
		this.times = times;
	}

	public void perform() {
		System.out.println("Jump rope " + times + " times!");
	}
}
