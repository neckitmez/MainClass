package MainClass;

import java.util.Scanner;

public class BasicType {
	int a;
	Scanner sr;
	void zadanie1 (){
            System.out.println("Cosine:60 is equal to: 0.5");
            System.out.println("Cosine:45 is equal to: 0.7071");
            System.out.println("Cosine:40 is equal to: 0.766");
	}
	void zadanie2 (){
            System.out.print("Enter the length of the first leg: ");
            int a = sr.nextInt();
            System.out.print("Enter the length of the second leg: ");
            int b = sr.nextInt();
            int c=(a*a)+(b*b);
            int d= a+b+c;
            System.out.println("Perimeter: " +d);
            int e= (a*b)/2;
            System.out.println("The area of a right triangle: " +e);
	}
	void zadanie3 (){
            System.out.print("Enter the number: ");
            int a = sr.nextInt();
            int b = 0;
            for ( ; a != 0 ; a /= 10)
            ++b;
            System.out.println("Figures including" +b);
	}
	void zadanie4 (){
		System.out.println( (int)(Math.random()*7) - 3 );
	}
	void zadanie5 (){
		System.out.print("Enter the number: ");
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
		Scanner sr = new Scanner(System.in);
		System.out.print("Entering integer: ");
		n = sr.nextInt();
		do
		sum = sum + (n % 10);
		while((n/=10) != 0);
		System.out.println("Sum of the numbers: " +sum );
	}
}