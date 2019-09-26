import java.util.Scanner;

class SwappingNumbers { 
	Scanner sc= new Scanner(System.in);
	int num1, num2;
	
	public void display() {
	System.out.println("Please enter your first number, num1:");
	num1=sc.nextInt();
	
	System.out.println("Please enter your second number,num2:");
	num2=sc.nextInt();
	
	 num1 = num1 + num2; 
     num2 = num1 - num2; 
     num1 = num1 - num2; 
     
     System.out.println("After swaping:"
             + " num1 = " + num1 + ", num2 = " + num2); 
     }
	
    public static void main(String[] args) 
    { 
    	SwappingNumbers s= new SwappingNumbers();
    	s.display();
        
    } 
}
