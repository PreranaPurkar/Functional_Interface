package com.technospace.interfaced;
interface Calculation{
	void add(int x,int y);
	
}
public class FunctionalInterface {

	public static void main(String[] args) {
		Calculation cal = (x,y)->System.out.println("Addition of Two number="+(x+y));
		cal.add(9, 8);
	}

}
