package com.acadgild.session.five;

public class Area {
	int length;
	int breadth;

	Area(int a, int b) // Constructor used when area calculation of rectangle 
						
	{
		length = a;
		breadth = b;
	}

	Area(int a) // Constructor used when area calculation of square
	{
		length = breadth = a;
	}

	public void CalcuateArea()
	{
	System.out.println("Area is : " +length*breadth);
	}
}
