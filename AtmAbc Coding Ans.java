package com.assignmentatm;


import java.util.ArrayList;
import java.util.Scanner;
public class Atm1 
{

	public static void main(String[] args) throws Exception 
	{
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> count = new ArrayList<>();
	
	//int balance = 0;
	boolean flag = true;
	while ( flag == true )
	{
		System.out.println("enter your choice 1 for deposit and 2 for withdraw ");//1
		
		int choice = sc.nextInt();
	switch(choice) 
	{
	case 1:deposit(count, sc);
	break;
	
	case 2:withdraw(count, sc);
	break;
	
	default:
	System.out.println("For exit to the system enter 0");
	flag = false;
	break;
	}
	}
//	while(choice!=0) 
//	{
//	switch(choice) 
//	{
//	case 1:deposit(count, sc);
//	break;
//	
//	case 2:withdraw(count, sc);
//	break;
//	
//	default:
//	System.out.println("please enter correct choice");
//	}
//	}
	}
	private static void withdraw(ArrayList<Integer> count, Scanner sc) throws Exception
	{
		try
		{
	int Total = (count.get(0)*2000) +(count.get(1)*1000)+(count.get(2)*500)+(count.get(3)*200)
	+(count.get(4)*100);
	
	System.out.println("enter amount for withdrawl");
	
	int amount = sc.nextInt();
	
	if(amount==0||amount>Total)
	{
	System.out.println("Incorrect or Insufficient funds");
	return;
	
	}
	else {//5000/2000
	int twoth=0, oneth=0, fivehund=0, twohund=0, onehund=0;
	if(amount/2000>0)
	{
	twoth = amount/2000;
	count.add(0, count.get(0)-twoth);
	}
	if(amount/1000>0)
	{
	oneth = amount/1000;
	count.add(1, count.get(1)-oneth);
	}
	if(amount/500>0) 
	{
	fivehund = amount/500;
	count.add(2, count.get(2)-fivehund);
	}
	if(amount/200>0) 
	{
	twohund = amount/200;
	count.add(3, count.get(3)-twohund);
	}
	if(amount/100>0) 
	{
	onehund = amount/500;
	count.add(4, count.get(4)-fivehund);
	}
	System.out.println("Dispensed: 2000s="+twoth+ ",1000s=" +oneth+ ",500s=" +fivehund+",200s= "+twohund+ "100s=" +onehund);
	System.out.println("Balance: 2000s= "+count.get(0)+",1000s= "+ count.get(1)+
	",500s= "+ count.get(2)+",200s= "+ count.get(3)+",100s= "+ count.get(4));
	Total = Total-amount;
	System.out.println("Total=" + Total);
	System.out.println("For exiting the system type 0");
	}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Insufficient ballence");
		}
	} 
	
	private static void deposit(ArrayList<Integer> count, Scanner sc) 
	{
	System.out.println("enter note for 2000?");
	int twothousand = sc.nextInt();
	System.out.println("enter note for 1000?");
	int onethousand = sc.nextInt();
	System.out.println("enter note for 500?");
	int fivehundred = sc.nextInt();
	System.out.println("enter note for 200?");
	int twohundred = sc.nextInt();
	System.out.println("enter note for 100?");
	int hundred = sc.nextInt();
	
	if(twothousand<0 || onethousand<0 || fivehundred<0 || twohundred<0 || hundred<0) {
	System.out.println("Incorrect deposit amount");
	}
	else if(twothousand==0 && onethousand==0 && fivehundred==0 && twohundred==0 && hundred==0) {
	System.out.println("Deposit amount cannot be zero");
	}
	else
	{
	count.add(twothousand);
	count.add(onethousand);
	count.add(fivehundred);
	count.add(twohundred);
	count.add(hundred);
	System.out.println("Balance: 2000s= "+count.get(0)+",1000s= "+ count.get(1)+
	",500s= "+ count.get(2)+",200s= "+ count.get(3)+",100s= "+ count.get(4));
	int Total = (count.get(0)*2000) +(count.get(1)*1000)+(count.get(2)*500)+(count.get(3)*200)
	+(count.get(4)*100);
	System.out.println("Total=" + Total);
	System.out.println("For exiting the system type 0");
	}
	}
