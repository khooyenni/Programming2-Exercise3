package Exercise3;

import java.util.Scanner;

public class Multicooker {
	
	String brand, model, colour;
	int power;
	double bowlCapacity, price;
	
	Scanner in = new Scanner(System.in);
	
	Multicooker(){
		System.out.println("Please enter the brand of the multicooker : ");
		this.brand=in.nextLine();
		System.out.println("Please enter the model of the multicooker : ");
		this.model=in.nextLine();
		System.out.println("Please enter the colour of the multicooker ");
		this.colour=in.nextLine();
		System.out.println("Please enter the power of the multicooker ");
		this.power =in.nextInt();
		System.out.println("Please enter the bowl capacity of the multicooker ");
		this.bowlCapacity=in.nextDouble();
		System.out.println("Please enter the price of the multicooker");
		this.price=in.nextDouble();
	}
	
	Multicooker(String brand, String model, String colour, int power, double bowlCapacity, double price){
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.power = power;
		this.bowlCapacity = bowlCapacity;
		this.price = price;
		
	}
	

}
