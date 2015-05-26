package MainClass;
	
import java.util.Scanner;
	
public class MainClass {
		int a;
		Scanner sr;
		public static void main (String [] args){
			BasicType app = new BasicType();
			pseudorandomnumber app1= new pseudorandomnumber();
			app.begin();
			app1.begin();
			
		}
		void begin (){
			sr = new Scanner(System.in);
			a=1;
			while(a!=0) { 
				System.out.println("Select the job: ");
				a = sr.nextInt();
				if (a ==1) {
					zadanie1 ();
				}
				if (a ==2) {
					zadanie2 ();
				}
				if (a ==3) {
					zadanie3 ();
				}
				if (a ==4) {
					zadanie4 ();
				}
				if (a ==5) {
					zadanie5 ();
				}
				if (a ==6) {
					zadanie6 ();
				}
				if (a ==7) {
					zadanie7 ();
				}
				if (a ==8) {
					zadanie8 ();
				}
				if (a ==9) {
					zadanie9 ();
				}
				if (a ==10) {
					zadanie ();
				}
								
			}
			
		}
		private void zadanie() {
			// TODO Auto-generated method stub
			
		}
		private void zadanie9() {
			// TODO Auto-generated method stub
			
		}
		private void zadanie8() {
			// TODO Auto-generated method stub
			
		}
		private void zadanie7() {
			// TODO Auto-generated method stub
			
		}
		private void zadanie6() {
			// TODO Auto-generated method stub
			
		}
		private void zadanie5() {
			// TODO Auto-generated method stub
			
		}
		private void zadanie4() {
			// TODO Auto-generated method stub
			
		}
		private void zadanie3() {
			// TODO Auto-generated method stub
			
		}
		private void zadanie2() {
			// TODO Auto-generated method stub
			
		}
		private void zadanie1() {
			// TODO Auto-generated method stub
			
		}
	}