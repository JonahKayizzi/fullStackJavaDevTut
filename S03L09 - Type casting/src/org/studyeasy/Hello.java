package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		short x = 10;
		int y = x;	//implicit type casting (widening)
		short z = (short)y; //explicit type casting (narrowing)
		System.out.println(y);
		System.out.println(z);
		*/
		
		int a = 1;
		float b = 2.01f;
		
		int c = (int)(a*a + 2*a*b + b*b);
		System.out.println(c);
	}

}
