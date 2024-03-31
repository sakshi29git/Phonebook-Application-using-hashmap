package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class phone_det {
	Scanner sc=new Scanner(System.in);
	int key=1;
	HashMap<Integer,Phone> obj=new HashMap<>();
	HashMap<Integer,Phone> add_det()
	{
		Phone s=new Phone();
		obj.put(key, s);
		key++;
		return obj;
	}
	
	void disp(HashMap<Integer,Phone> obj)
	{
		if(obj.isEmpty())
		{
			System.out.println("List is empty..is.please add details first");
			System.exit(1);
		}
		else
		{
			for(Map.Entry<Integer, Phone> ele: obj.entrySet())
			{
				System.out.println("ID: " + ele.getKey());
				ele.getValue().disp();
				System.out.println();
			}
		}
	}
	
	void search(HashMap<Integer,Phone> obj)
	{
		String name;
		boolean found=false;
		if(obj.isEmpty())
		{
			System.out.println("List is empty..is.please add details first");
			System.exit(1);
		}
		else
		{
		
		System.out.println("Enter name: ");
		name=sc.next();
		for(Map.Entry<Integer, Phone> ele: obj.entrySet())
		{
			if(ele.getValue().name.equals(name))
			{
				ele.getValue().disp();
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Details not found");
		}
		}
		
	}
	
	void delete(HashMap<Integer,Phone> obj)
	{
		String name;
		int n;
		boolean found=false;
		if(obj.isEmpty())
		{
			System.out.println("List is empty..is.please add details first");
			System.exit(1);
		}
		else
		{
	
		System.out.println("Enter name: ");
		name=sc.next();
		for(Map.Entry<Integer, Phone> ele: obj.entrySet())
		{
			if(ele.getValue().name.equals(name))
			{
				obj.remove(ele.getKey(), ele.getValue());
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Details not found");
		}
		else {
			System.out.println("Number deleted sucessfully.......");
		}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		phone_det op=new phone_det();
		
		HashMap<Integer,Phone> obj1=new HashMap<>();
		int choice,n,i;
		do {
			System.out.println("1. Add Phone number");
			System.out.println("2. Search phone number");
			System.out.println("3. Display all contact list");
			System.out.println("4. Delete number");
			System.out.println("5. Exit");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("How many phone numbers you want to add: ");
				n=sc.nextInt();
				for(i=0;i<n;i++)
				{
				obj1=op.add_det();
				}
				
				break;
				
			case 2:
				op.search(obj1);
				break;
				
			case 3:
				op.disp(obj1);
				break;
				
			case 4:
				op.delete(obj1);
				break;
				
				
			case 5:
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Wrong choice");
				break;
			}
		}while(choice!=5);
		
	}

}
