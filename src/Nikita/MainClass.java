package Nikita;
	
import java.util.Scanner;
	
public class MainClass {
		static Scanner sr;
		
		public static void main (String [] args){
			sr = new Scanner(System.in);
			
			int a = 1;
			while (a != 0) {
				System.out.print("Введите номер главы: ");
				a = sr.nextInt();
				
				switch(a) {
				case 1: 
					BasicType basic = new BasicType();
					System.out.print("Введите номер задания: ");
					a = sr.nextInt();
					switch(a) {
					case 1: basic.zadanie1(); break;
					case 2: basic.zadanie2(); break;
					case 3: basic.zadanie3(); break;
					default: break;
					}
					break;
				case 2:
					PseudoRandomNumber pseudo = new PseudoRandomNumber();
					System.out.print("Введите номер задачи: ");
					a = sr.nextInt();
					switch(a) {
					case 1: pseudo.zadanie(); break;
					default: break;
					}
					break;
				default: break;
				}
			}	
			System.out.println("Good Bye!");
		}
}