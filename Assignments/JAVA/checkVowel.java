import java.util.Scanner;

class checkVowel { 
	public static void main(String args[]){
		System.out.println("Enter a character :");
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || 
				ch=='O' || ch=='u' || ch=='U')
		{	
			System.out.println("Given character is an vowel");
		}
		else
		{
			System.out.println("Given character is a consonant");
		}
	  }
}
