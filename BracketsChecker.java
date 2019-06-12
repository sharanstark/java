package java_prac;
import java.util.*;
public class BracketsChecker {

	public static void main(String[] args) {
		System.out.println("- - - Brackets Checker [ without stack ] - - -\n\n");
		Scanner scan=new Scanner(System.in);
		System.out.print("Input : " );
		String s = scan.nextLine();
		scan.close();
		System.out.println("\n...working...\n");
		String o="([{";
		String c=")]}";
		String x="";
		int check=0;
		for (int i = 0; i < s.length(); i++) {
			if(o.contains(String.valueOf(s.charAt(i))) && check==0){
				x+=s.charAt(i);
				 System.out.println("In : "+x); // stack in
			}else if(c.contains(String.valueOf(s.charAt(i))) && check==0) {
				try {
				x=x.substring(0,x.length()-1);
				System.out.println("Out : "+x);   // stack out
				}
				catch(StringIndexOutOfBoundsException e) {
					System.out.println("\n\nCompilation Error : opening bracket(s) missing \n\n© github.com/sharanstark 2k19" );
					check=1;
				}
			}
	}	
		if(check==0) {
		if(x.length()==0 ) {
			System.out.println("\n\nCompilation Success \n\n© github.com/sharanstark 2k19");
		}else {
			System.out.println("\n\nCompilation Error : closing bracket(s) missing \n\n© github.com/sharanstark 2k19" );
		}
	  }
	} 
}
