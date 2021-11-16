package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double numberKilo;
		int agePerson;
		double discountMin = 0.2;
		double discountOver = 0.4;
		double priceKilo = 0.21;
		
		
		System.out.print("Insert number kilometres: ");
		numberKilo = scanner.nextDouble();
		System.out.print("Insert Age: ");
		agePerson = scanner.nextInt();
		
		
		//debug
		System.out.println("Insert kilometres: " + numberKilo + " Insert age: " + agePerson);
		
		
		//prezzo biglietto 
			double ticketPrice = numberKilo * priceKilo;
			System.out.println("Ticket price without discount: " + ticketPrice);
		
		
		if(agePerson < 17) {
			//sconto min-18
			ticketPrice = ticketPrice - (ticketPrice * discountMin);
			System.out.println("Discount 20%");
		} else if (agePerson >= 65) { 
			//sconto over-65
			ticketPrice = ticketPrice - (ticketPrice * discountOver);
			System.out.println("Discount 40%");
		} else {
			 //no sconto
			System.out.println("No Discount");
		}
		
		
		//stampa il prezzo totale del biglietto
		System.out.println("Total ticket price: " + ticketPrice);
		
		
		//close scanner
		scanner.close();
	}

}
