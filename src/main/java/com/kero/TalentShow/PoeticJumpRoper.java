package com.kero.TalentShow;

public class PoeticJumpRoper extends JumpRoper {
	private Poem poem;
	
	public PoeticJumpRoper(Poem poem) {
		super();
		this.poem = poem;
	}
	
	public PoeticJumpRoper(int times, Poem poem) {
		super(times);
		this.poem = poem;
	}
	
	public void perform() {
		super.perform();
		System.out.println("开始吟诗：");
		poem.recite();
	}
}