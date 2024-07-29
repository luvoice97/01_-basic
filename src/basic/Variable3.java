package basic;

import java.util.Random;

public class Variable3 {

	public static void main(String[] args) {
		int big = Math.max(25,36);
		System.out.println("큰값'= " + big);
		
		// 12.7, 78.5 중에서 작은값 
		
		double small = Math.min(12.7,78.5);
		System.out.println(("작은값'=" + small));
		
		// 2의 5승 
		
		double power = Math.pow( 2.0 ,5.0);
		
		System.out.println(("2의5승 =" + power));
		
		//난수 
		//컴퓨터가 불규칙하게 발생하는 수 
		//<0= 난수 < 1
		
		double a = Math.random();
		
		//int c =  a에서 두자리만 출력하시오;
		
		int c = (int)(a*100);
		
		// int d =x~y사이의 난수 발생 (int) (Math.random() * (y-x+1)+x)  65~90 사이 난수 
				
		int d =(int)(Math.random() * 26 +65);
		 		
		char e = (char)(Math.random() * 26 +65);

		System.out.println(a);
				
		double b = new Random().nextDouble();
				
	    System.out.println(b);
	    
	    System.out.println(c);
	    
	    System.out.println(d);
	    
	    System.out.println(e);
	}

}
