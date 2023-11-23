package com.AbstractionDemo;

public abstract class SampleAc implements Laptop {
	@Override
	public void copy() {
		System.out.println("copy");
		
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("paste");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cut");
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("keyboard");
	}

	@Override
	public void commomCode() {
		// TODO Auto-generated method stub
		
	}

}
