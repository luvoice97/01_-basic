package operator;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현금입력: ");
		int a = sc.nextInt();
			
		int b = a/1000; 
				
		int c = a%1000/100;
		
		int d = a%100/10;
		
		int e = a%10;
		
	    System.out.println("천원"+ b + "장");
	    
	    System.out.println("백원"+ c + "개");
	    
	    System.out.println("십원"+ d + "개");
	    
	    System.out.println("일원"+ e + "개");

	}

}
