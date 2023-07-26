package com.technospace.interfaced;
interface bikeInterface{
	void show();
	default void showAll(){
		System.out.println("This is Bike Manufacturing Company");
	}
	static void showInterface() {
		System.out.println("This is Bike Interface Method");
	}
}
class Hero implements bikeInterface{

	@Override
	public void show() {
		System.out.println("This is Hero Bike Company");
	}
	
}
class Shine implements bikeInterface{

	@Override
	public void show() {
		System.out.println("This is Shine Bike Company");
		
	}
	
}
public class InterfacePract {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.show();
		hero.showAll();
		Shine shine = new Shine();
		shine.show();
		shine.showAll();
		bikeInterface.showInterface();

	}

}
