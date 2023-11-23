package com.AbstractionDemo;

public class User {
public static void main(String[] args) {
	Lenovo l=new Lenovo();
	l.copy();
	l.paste();
	SampleAc s=new SampleAc() {
	};
	s.cut();s.keyboard();
	s.audio();
	s.copy();
}
}
