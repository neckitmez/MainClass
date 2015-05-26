package MainClass;

import java.util.Scanner;

public class pseudorandomnumber {
	Scanner sr;
	void zadanie4 (){
		System.out.println( (int)(Math.random()*7) - 3 );
	}
	void zadanie5 (){
		System.out.print("Enter the number: ");
        Scanner sr = null;
		int a = sr.nextInt();
        int b = a+a+1;
		System.out.println( (int)(Math.random()*b) - a );
	}
	void zadanie6 (){
		System.out.print("Enter the number: ");
        int a = sr.nextInt();
        int b = a+a+1;
		System.out.println( (int)(Math.random()*b) - a );
	}
	void zadanie7 (){
		System.out.print("Enter the number: ");
        int a = sr.nextInt();
        System.out.print("Enter the number: ");
        int b = sr.nextInt();
        if (a>b){
        	System.out.println("Error!");
        }
        if (a<b){
        	System.out.println( (int)(Math.random()*a+b) );
        }
	}
	void zadanie8 (){
		System.out.println((double)21/8); 
	}
	void zadanie9 (){
		int n;
		int sum = 0; 
		System.out.print("Entering integer: ");
		n = sr.nextInt();
		do
		sum = sum + (n % 10);
		while((n/=10) != 0);
		System.out.println("Sum of the numbers: " +sum );
	}
	void zadanie (){
		int n;
		int sum = 0; 
		sr = new Scanner(System.in);
		System.out.print("Entering integer: ");
		n = sr.nextInt();
		do
		sum = sum + (n % 10);
		while((n/=10) != 0);
		System.out.println("Sum of the numbers: " +sum );
	}
	public void begin() {
		// TODO Auto-generated method stub
		
	}
}
