package MainClass;

import java.util.Scanner;

public class BasicType {
	Scanner sr;
	private Scanner sr2;
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
	
	public void begin1() {
		// TODO Auto-generated method stub
		
	}
	public void begin() {
		// TODO Auto-generated method stub
		
	}
}