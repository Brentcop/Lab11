package com.car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int counter = 1;
		int counter2 = 0;
		ArrayList<Car> carList = new ArrayList<>();
		int numCars = 6;
		String ans = null;
		//System.out.println("How many cars are you entering? ");
		/*for (int i = 0; i < numCars;i++) {
			scan.nextLine();
			System.out.println("Enter a car Make: ");
			String make = scan.nextLine();
			System.out.println("Enter a car Model: ");
			String model = scan.nextLine();
			System.out.println("Enter a Year for the car: ");
			int year = scan.nextInt();
			System.out.println("Enter a Price for the car: ");
			double price = scan.nextDouble();
			carList.add(new Car(make,model,year,price, price));
					counter++;
		}*/
		carList.add(new Car("Nikolai","Model S",2017,5999.90));
		carList.add(new Car("Ford","Escape",2017,3199.90));
		carList.add(new Car("Chevey","Corvette",2017,4999.90));
		carList.add(new Car("Honda","Fiot",2017,1499.90,35987.6));
		carList.add(new Car("GM","Jeep",2015,8500.90,12345.0));
		carList.add(new Car("GM","Jimmy",2004,7099.90,18950));
		
		for (int i = 0; i<numCars; i++) {
			counter2++;
			System.out.print(counter2+". ");
		System.out.println(carList.get(i));
		}
		System.out.println(counter2 + 1 + ". Quit");
		do{System.out.println("Which car would you like?");
		counter = scan.nextInt();
		if (counter <= 7) {
			scan.nextLine();
			System.out.println("Would you like to buy this car?");
			ans = scan.nextLine();
				System.out.println("Excellent! Our finance department will be in touch shortly.");
				counter = counter-1;
				System.out.println(carList.get(counter));
				carList.remove((counter));
				//numCars = numCars-1;
				 
				int counter3 = 0;
				for (int i = 0; i<carList.size(); i++) {
					counter3++;
					System.out.print(counter3 + " ");
				System.out.println(carList.get(i));}
				System.out.println(counter3 + 1 +". Quit");
				}
				 }while(ans != "y");
			} {System.out.println("Goodbye.");
			System.out.println("Have a great day!");
			}

	
}
