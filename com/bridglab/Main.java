package com.bridglab;
import java.util.Scanner;
public class Main {

	public static Scanner input = new Scanner(System.in);
	public static int choice=1;
	public static int quantity=1;
	public static String again;
	public static double total=0;
	public static double pay=0;
	public static void menu() {
		
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("\tWelCome To Our Restaurant");
		System.out.println("\tRestaurant Menu");
		System.out.println("\t1 Burger BDT $80.00 ");
		System.out.println("\t2 Pizza BDT $100.00");
		System.out.println("\t3 Coffee BDT $60.00");
		System.out.println("\t4 Cancle ");
   }
	
	public static void order() {
		System.out.println("1.to Burger || 2. Pizza || 3. Coffee");
		System.out.println("press you want to order :");
		choice = input.nextInt();
		if(choice==1) {
			System.out.println("you order Burger");
			System.out.println("How Many Burger you want");
			quantity=input.nextInt();
			total=total+(quantity*80);
			System.out.println("you want to buy again");
		    System.out.println("press y for yess and N for no");
		    again =input.next();
		    if(again.equalsIgnoreCase("y")) {
		    order();
			}else {
				System.out.println("Enter Payment :");
				pay=input.nextDouble();
				if(pay<total) {
					
					System.out.println("No Need More");
				}else {
					System.out.println("total"+total);
					total =pay-total;
					System.out.println("Customer return"+total);
					
				}
			}}	
	else if(choice==2) {
			System.out.println("you order pizza");
			System.out.println("How Many Pizza you want");
			quantity=input.nextInt();
			total=total+(quantity*100);
			System.out.println("you want to buy again");
		    System.out.println("press y for yess and N for no");
		    again =input.next();
		    if(again.equalsIgnoreCase("y")) {
		    order();
			}else {
				System.out.println("Enter Payment :");
				pay=input.nextDouble();
				if(pay<total) {
					
					System.out.println("No Need More");
				}else {
					System.out.println("total"+total);
					total =pay-total;
					System.out.println("Customer return"+total);
					
				}
					
			}
			}
	       else if  (choice==3) {
				System.out.println("you order Coffee");
				System.out.println("How Many Coffee you want");
				quantity=input.nextInt();
				total=total+(quantity*60);
				System.out.println("you want to buy again");
			    System.out.println("press y for yess and N for no");
			    again =input.next();
			    if(again.equalsIgnoreCase("y")) {
			    order();
				}else {
					System.out.println("Enter Payment :");
					pay=input.nextDouble();
					if(pay<total) {
						
						System.out.println("No Need More");
					}else {
						System.out.println("total"+total);
						total =pay-total;
						System.out.println("Customer return"+total);
						
					}
				  }	
	           }
	        else if(choice==4) {
	        	   System.exit(0);
	       }else {
	    	   System.out.println("choose a food");
	    	   order();
	       }
	}

	
	public static void main(String[] args) {
		menu();
		order();
}
}