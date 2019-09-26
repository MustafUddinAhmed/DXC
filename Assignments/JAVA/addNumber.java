import java.util.Scanner;

class addNumber { 
	public static void main(String args[]){
		int a, b, sum;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your 1st Number : ");
        a = sc.nextInt();
        System.out.print("Enter your 2nd Number : ");
        b = sc.nextInt();
		if(a>0 && b>0) {
			sum = a + b;
			System.out.print("Sum of the Entered Two Number is " +sum);
		}
		else {
			System.out.println("Negative numbers can't be added");
		}
	  }
}
