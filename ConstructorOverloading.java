package com.acadgild.session.five;

public class ConstructorOverloading {

	public static void main(String args[]) {

		Area Rectangle = new Area(10, 20);
		Rectangle.CalcuateArea();
		Area Square = new Area(5);
		Square.CalcuateArea();
	}
}
