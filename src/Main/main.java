package Main;

import java.util.Scanner;
import java.math.*;

public class main {
	public static void main(String[] args) {
		int n ,x;
		int a,b ,q,tmpZADoB,ux=0,uy = 1,tmpZUxDoUy,d,s,t;
		Scanner scan= new Scanner(System.in);
		n = scan.nextInt();
		x = scan.nextInt();
		//n=84;
		x=15;
		a=n;
		b=x;
		
		
		do 
		{
			q = a/b;
			tmpZADoB = b;
			b=a-q*b;
			System.out.println(b);
			a = tmpZADoB;
			tmpZUxDoUy = uy;
			uy = ux-q*uy;
			ux = tmpZUxDoUy;
			
			

		} while (b!=0); 
			d=a;
			t=ux;
			s=(d-t*x)/n;
			
			System.out.println("d: "+d + "\nt: "+ux + "\ns: " + s);
			System.out.println("NWD("+n+","+x+") = "+d + " = "+ x+"*"+s + "+"+n+"*"+t);
	}

}
