
import java.util.*;

class Current extends CGPA{
	Scanner scan= new Scanner(System.in);
	int lab=2;
	int theory=3;
	int sum=0;
	
	int g2s(String s) {
		int scr = 0;
		if(s.equalsIgnoreCase("O")) scr=10;
		if(s.equalsIgnoreCase("A+")) scr=9;
		if(s.equalsIgnoreCase("A")) scr=8;
		if(s.equalsIgnoreCase("B+")) scr=7;
		if(s.equalsIgnoreCase("B")) scr=6;
		return scr;
	}
	void calc() {
		System.out.println("\n- - - GPA CALCULATOR - - -\n");
		String sub[] = new String[] {"AI","BDA","CIS",".Net","( Py / OOAD / DS )","( AGILE / UED / ADOC )",".NET LAB","CBD LAB","MINI PRO"};
		for (int i = 0; i < 6; i++) {
			System.out.print("Enter grade obtained in "+sub[i]+" : ");
			String temp=scan.next(); 
			sum += (g2s(temp))*3;
		}
		for (int i = 6; i < 9; i++) {
			System.out.print("Enter grade obtained in "+sub[i]+" : ");
			String temp=scan.next(); 
			sum += (g2s(temp))*2;
		}
		System.out.println("\n\nYour GPA is "+((double)sum/24));
		System.out.print("\nGo back to Main Menu ? ( Y / N )");
		String c=scan.next();
		if(c.equalsIgnoreCase("y")) {
		System.out.println("\n... exiting ...\n\n\n");
			main (new String [] {});
		}else if(c.equalsIgnoreCase("n")){
			System.out.println("\n... exiting ...\n\n\n");
		}else {
			System.out.println("\n... Invalid choice ...\n\n\n");
		}
	}	
	void result() {
		double proof=0d;
		double res=0d;
		System.out.println("\n- - - CGPA CALCULATOR - - -\n");
		System.out.println("\nFind your GPA from -> https://ce.ksrei.org \n");
		for(int i=1;i<=6;i++) {
			System.out.print("Enter sem "+(i)+" GPA :");
			double temp=0;
			int div=1;
			if(i==2 || i==3 || i==5 ) div=25;
			if(i==1 || i==6) div=24;
			if(i==4 ) div=26;
			res +=(int)Math.round(((scan.nextDouble())*div));
			if(i==5) {
				proof=res;
			}
		}
		System.out.println("\n\nYour Current CGPA is "+(res/149));
		System.out.println("Proof  : Your CGPA upto 5th sem is "+(proof/125));
		System.out.print("\nGo back to Main Menu ? ( Y / N )");
		String c=scan.next();
		if(c.equalsIgnoreCase("y")) {
		System.out.println("\n... exiting ...\n\n\n");
			main (new String [] {});
		}else if(c.equalsIgnoreCase("n")){
			System.out.println("\n... exiting ...\n\n\n");
		}else {
			System.out.println("\n... Invalid choice ...\n\n\n");
		}
	}
	}

public class CGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Current obj = new Current();
		Scanner scan= new Scanner(System.in);
		System.out.println("- - -  GPA / CGPA CALCULATOR by STARKERS - - - \n\n");
		System.out.print("Main Menu \n \n1.Calaculate currrent sem GPA\n2.Calculate overall CGPA\n\nEnter your choice : ");
		int choice = scan.nextInt();
		System.out.println();
		if(choice==1) {
			obj.calc();
		}else if(choice==2) {
			obj.result();
		}else {
			System.out.println("\n... Invalid choice try again ...\n\n\n");
			main(new String[] {});
		}
	}

}
