package homework;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a의 값 ");
		int a = scan.nextInt();
		System.out.println("b의 값 ");
		int b = scan.nextInt();
		System.out.println("c의 값 ");
		int c = scan.nextInt();

		if (a <= b && b <= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a <= c && c <= b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b <= a && a <= c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b <= c && c <= a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c <= a && a <= b) {
            System.out.println(c + " " + a + " " + b);
        } else { // c <= b && b <= a
            System.out.println(c + " " + b + " " + a);
        }
        
			

	}

}
