package hashmap;

import java.util.Scanner;

public class Phone {
	long number,n;
	int count=0;
	String name;
	Scanner sc=new Scanner(System.in);
	Phone()
	{
		System.out.println("enter name: ");
		name=sc.next();
		System.out.println("Enter your phone number: ");
		number=sc.nextLong();
		n=number;
		while(n!=0)
		{
			n=n/10;
			count++;
			
		}
		if(count!=10)
		{
			System.out.println("Invalid number");
			System.exit(1);
		}
			
		
	}

	
	void disp()
	{
		System.out.println("Name: " + name);
		System.out.println("Phone number: " + number);
	}
}
