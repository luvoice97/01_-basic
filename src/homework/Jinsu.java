package homework;

import java.util.Scanner;

public class Jinsu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("10진수값을 입력하세요 : ");
		int a = scan.nextInt();
		
		scan.close();
		
		String binaryString = Integer.toBinaryString(a);
		String octalString = Integer.toOctalString(a);
		String hexString = Integer.toHexString(a);
		
		System.out.println(a); 
		System.out.println(binaryString); 
		System.out.println(octalString); 
		System.out.println(hexString);
		
		
	}

}


/*

*/