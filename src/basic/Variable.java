package basic;

public class Variable {

	public static void main(String[] args) {
		boolean a = 25 > 36 ;
		// TODO Auto-generated method stub
		System.out.println(a);
		
		char b = 'A';
		System.out.println(b);
		char c = 65;
		System.out.println(c); //A
		
		//byte d = 300; -error // 바이트 정수형은 127까지 
		
		int e = 65;
		System.out.println(e);
		int f = 'A';
		System.out.println(f); //65 
		
		long g = 25L; // long 형 상수 
		System.out.println(g);
		
		//float h = 43.8; -error
		
		//float h = 43.8f; // float형 상수
	
	    //두번째 
		float h = (float)43.8; //Casting
		System.out.println(h);		
	}

}
