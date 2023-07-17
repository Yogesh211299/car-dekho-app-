package com.jspider.cardekho_case_study.main;
import java.util.Scanner;

import com.jspider.cardekho_case_study.operation.CarOperations;

public class CarDekhoMenu extends CarOperations {

	public static void main(String[] args) {
		CarOperations carOper= new CarOperations();
		carOper.createList();
		menu();
	}
	public static void menu() {
		do {
			
		
		System.out.println("==============MENU============");
		System.out.println("1.Add Car Details.\n2.Search Car Details.\n3.update Car Details\n4.delete Car details\n5.Exit\n");
	Scanner inp = new Scanner(System.in);
	int choice=inp.nextInt();
	CarOperations carOper= new CarOperations();
	switch (choice) {
	case 1:carOper.addCarDetails();
		  break;
	case 2:
		carOper.searchCarDetails();
		break;
	case 3:
		carOper.updateCarDetails();
		break;
	case 4:
	         	try {
	         		carOper.deleteCarDetails();
				} catch (Exception e) {
				System.out.println(" ");
				}
	       
		break;
	case 5:System.out.println("------Thank you------ ");
		inp.close();
		System.exit(0);
		break;

	default:
		System.out.println("invalid choice");
		System.out.println("try again ");
		
	}
		} while (true);
	}

}
