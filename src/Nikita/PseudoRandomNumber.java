package Nikita;

public class PseudoRandomNumber {
	void zadanie4 (){
		System.out.println( (int)(Math.random()*7) - 3 );
	}
	void zadanie5 (){
		System.out.print("Enter the number: ");
		int a = MainClass.sr.nextInt();
        int b = a+a+1;
		System.out.println( (int)(Math.random()*b) - a );
	}
	void zadanie6 (){
		System.out.print("Enter the number: ");
        int a = MainClass.sr.nextInt();
        int b = a+a+1;
		System.out.println( (int)(Math.random()*b) - a );
	}
	void zadanie7 (){
		System.out.print("Enter the number: ");
        int a = MainClass.sr.nextInt();
        System.out.print("Enter the number: ");
        int b = MainClass.sr.nextInt();
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
		n = MainClass.sr.nextInt();
		do
		sum = sum + (n % 10);
		while((n/=10) != 0);
		System.out.println("Sum of the numbers: " +sum );
	}
	void zadanie (){
		int n;
		int sum = 0; 
		System.out.print("Entering integer: ");
		n = MainClass.sr.nextInt();
		do
		sum = sum + (n % 10);
		while((n/=10) != 0);
		System.out.println("Sum of the numbers: " +sum );
	}
}
