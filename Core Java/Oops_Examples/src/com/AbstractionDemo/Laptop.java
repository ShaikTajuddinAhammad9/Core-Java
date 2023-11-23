package com.AbstractionDemo;

public interface Laptop {
	public void copy();
	public void paste();
	public void cut();
	public void keyboard();
	
	public default void security() {
		commomCode();
		System.out.println("laptop security");
	}
	public void commomCode();
	public default void audio() {
		commomCode();
		System.out.println("laptop audio");
	}
	
}
