package com.jspider.cardekho_case_study.operation;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

//import java.util.Iterator;
import com.jspider.cardekho_case_study.entity.Car;
import com.jspider.cardekho_case_study.main.CarDekhoMenu;

public class CarOperations {
	
	int id;
	String name;
	String fuelType;
	String brand;
	double price;
	boolean found=false;
	
	
	
	static ArrayList<Car> cars=createList();
	public static ArrayList<Car> createList() {
		ArrayList<Car> car=new ArrayList<Car>();
		return car;
	}	
    public void addCarDetails() {
    	Scanner inp=new Scanner(System.in);
    	System.out.println("HOW MANY CARS DO YOU WANT TO ADD");
        int carNo=inp.nextInt();
        for (int i = 1;i<=carNo; i++) {
			
		Car car=new Car();
	 	System.out.println("enter your Car Id :- ");
	      car.setCarId(inp.nextInt());
	System.out.println("enter your Car Name :- ");
	          inp.nextLine();
          car.setName(inp.nextLine());
	System.out.println("enter your Car Brand :- ");
		  car.setBrand(inp.nextLine());
	System.out.println("enter your Car Model :- ");
	      car.setModel(inp.nextLine());
	System.out.println("enter your Car fuelType :- ");
		  car.setFuelType(inp.nextLine());
	System.out.println("enter your Car Price :- ");
	      car.setPrice(inp.nextDouble());
	cars.add(car);
	System.out.println("\n"+car.getName()+" CAR DETAILS ADDED SUCCESSFULLY !!!!! ");
        }
//        inp.close();
}
    
    
    
    
public void searchCarDetails() {
	Scanner inp=new Scanner(System.in);
	if (cars.size()==0) {
		System.out.println("TOTAL CAR DETAILS :- "+cars.size());
		System.out.println("!!!!NO CARS FOR SEARCH!!!!!");
	}else {
    
	System.out.println("======= Search Car by ======\n");
	System.out.println("1.Car Name\n2.Car Brand\n3.Car FuelType\n4.All cars\n5.Go Back\n");
	int choice=inp.nextInt();
	System.out.println("\nTOTAL CAR DETAILS :- "+cars.size()+"\n");
	switch (choice) {
	case 1:
		System.out.println("enter your Car name");
		      inp.nextLine();
		name=inp.nextLine();
		System.out.println("======CAR DETAILS=====");	
		System.out.println("ID\t NAME\t\t BRAND\t\tMODEL \tFUELTYPE\t\t PRICE\t\t   "+"\n ==============================================================================\n");
		for(Car e:cars ) {
			if(e.getName().equals(name)) {
				System.out.println(e);
				found=true;
			}
		}
		if (!found) {
			System.out.println("Car with this "+ name+" is not present");
		}
		break;
	case 2:
		System.out.println("enter your Car Brand");
	      inp.nextLine();
	brand=inp.nextLine();
	System.out.println("======CAR DETAILS=====");	
	System.out.println("ID\t NAME\t\t BRAND\t\tMODEL \tFUELTYPE\t\t PRICE\t\t   "+"\n ==============================================================================\n");
		
	for(Car e:cars ) {
		if(e.getBrand().equals(brand)) {
			System.out.println(e);
			found=true;
		}
	}
	if (!found) {
		System.out.println("CAR WITH THIS  "+ brand +" IS NOT PRESENT");
	}
	break;
	case 3:
		System.out.println("enter your Car fuelType");
	      inp.nextLine();
	fuelType=inp.nextLine();
	System.out.println("======CAR DETAILS=====");	
	System.out.println("ID\t NAME\t\t BRAND\t\tMODEL \tFUELTYPE\t\t PRICE\t\t   "+"\n ==============================================================================\n");
	
	for(Car e:cars ) {
		if(e.getFuelType().equals(fuelType)) {
			System.out.println(e);
			found=true;
		}
	}
	if (!found) {
		System.out.println("Car with this"+ fuelType +"is not present");
	}
	break;
	case 4:
		System.out.println("======CAR DETAILS=====");	
		System.out.println("ID\t NAME\t\t BRAND\t\tMODEL \tFUELTYPE\t\t PRICE\t\t   "+"\n ==============================================================================\n");
			for(Car e:cars ) {
		       System.out.println(e);		
			}
			System.out.println("\nTOTAL CAR DETAILS :- "+cars.size()+"\n");
			break;
	case 5:
		CarDekhoMenu.menu();
		break;

	default:
		System.out.println("invalid choice \n please choose correct choice\n Try Again");
		
	}
// inp.close();
	}
}
public void updateCarDetails() {
	Scanner inp=new Scanner(System.in);
	if (cars.size()==0) {
		System.out.println("TOTAL CAR DETAILS :- "+cars.size());
		System.out.println("!!!!NO CARS FOR UPDATE!!!!!");
	}else {
	System.out.println("======ALL CAR DETAILS=====");	
System.out.println("ID\t NAME\t\t BRAND\t\tMODEL \tFUELTYPE\t\t PRICE\t\t   "+"\n ==============================================================================\n");
	for(Car e:cars ) {
       System.out.println(e);		
	}
	System.out.println("\n ALL CAR DETAILS :- "+cars.size()+"\n");
	
	System.out.println("====UPDATE DETAILS");
	System.out.println("1. SELECT CARS FOR UPDATE DETAILS \n2.GO BACK TO MENU");
    int choice=inp.nextInt();
	switch (choice) {
	case 1:
		System.out.println("enter car Id");
	     id=inp.nextInt();
	      for(Car e:cars) {
	    	if (e.getCarId()==id) {
	    		System.out.println("enter car Name");
	    		inp.nextLine();
			name=inp.nextLine();
			System.out.println("enter car Brand");
			brand=inp.nextLine();
			System.out.println("enter car price");
            price=inp.nextDouble();
	      e.setName(name);
	      e.setBrand(brand);
	      e.setPrice(price);
	      System.out.println("!!!! update successfully !!!!");
	      found=true;
		}
	}
	if (!found) {
		System.out.println("CAR WITH THIS "+ id +" IS NOT PRESENT");
	}
	break;
	case 2:
		CarDekhoMenu.menu();
		break;		
	default:
		System.out.println("invalid choice \n please choose correct option\n Try Again\n");
		break;
	}
//inp.close();
	}
}


public void deleteCarDetails() throws ConcurrentModificationException {
	
	Scanner inp=new Scanner(System.in);
	if (cars.size()==0) {
		System.out.println("TOTAL CAR DETAILS :- "+cars.size());
		System.out.println("!!!!NO CARS FOR REMOVE!!!!!");
	}else {
	System.out.println("====== ALL CAR DETAILS =====");	
	System.out.println("ID\t NAME\t\t BRAND\t\tMODEL \tFUELTYPE\t\t PRICE\t\t   "+"\n ==============================================================================\n");
		for(Car e:cars ) {
	       System.out.println(e);		
		}
		System.out.println("\n TOTAL CAR DETAILS :- "+cars.size()+"\n");
		System.out.println("-----REMOVE CAR----- ");
	System.out.println("enter car Id");
    id=inp.nextInt();
     for(Car e:cars) {
   	if (e.getCarId()==id) {
   		cars.remove(cars.indexOf(e));
     System.out.println("!!!! DELETE SUCCESSFULLY !!!!");
     found=true;
	}
}
if (!found) {
	System.out.println("car with this "+ id +" is not present");
}
//inp.close();
}
}
}
