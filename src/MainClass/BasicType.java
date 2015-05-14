import java.util.Scanner;

package BasicType;

public class BasicType {
	int a;
	Scanner sr;
	public static void main(String[] args) {
		BasicType app = new  BasicType();
		app.begin();
	}
	void begin (){
		sr = new Scanner(System.in);
		a=1;
		while(a!=0) { 

			System.out.print("Select the task: ");
			a = sr.nextInt();
			if (a ==1) {
				zadanie1 ();
			}if (a ==2) {
				zadanie2 ():
			}if (a ==3) {
				zadanie3 ();
			}
	void zadanie1 (){
		for (int a=1000; a<=9999; a=a+3) {
		if(a == 9999) {
	    break;
		}
		System.out.print(a + " ");
	}
	System.out.print("Stop!");
	}
	void zadanie2 (){
		for (int a=1000; a<=9999; a=a+3) {
		if(a == 9999) {
	    break;
		}
		System.out.print(a + " ");
	}
	System.out.print("Stop!");
	}
	void zadanie3 (){
		for (int a=1000; a<=9999; a=a+3) {
		if(a == 9999) {
	    break;
		}
		System.out.print(a + " ");
	}
	System.out.print("Stop!");
	}
}
