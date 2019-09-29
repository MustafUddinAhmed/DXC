package oopsDemo;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int id;
		

		CustomerAssignment customer[]=new CustomerAssignment[5];

		customer[0]=new CustomerAssignment(1, "Mustaf", "Assam", 10000);
		customer[1]=new CustomerAssignment(2, "Neha", "Delhi", 9000);
		customer[2]=new CustomerAssignment(3, "Sushma", "Pune", 8000);
		

		System.out.println("Please enter the Customer ID: ");
		id= sc.nextInt();
		if(id>0 && id<4) {
			System.out.println(customer[id-1]);
		}
		else {
			System.out.println("Customer ID is not available, Plesase enter a valid Customer ID");
		}
		
	}

}
