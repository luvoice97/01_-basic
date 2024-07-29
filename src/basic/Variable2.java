package basic;

public class Variable2 {
	int a; // 필드, 이미 초기화 되어있다
	static int b; 
	static String c; //클래스 타입의 초기값은 null
	
	//c = "apple"; error, 함수안에 써야 한다. 
	
	public static void main(String[] args) {
		int a = 100; //local variable (지역변수), 쓰레기값(초기화) 
		System.out.println(a); 
		
		//int a; -- error 
		System.out.println("필드 a = " + a);
		
		System.out.println("필드 a = " + new Variable2().a);
		 // system.out.println("필드 b = " +b);
		System.out.println("필드 b = " + new Variable2().b);
		
		c = "apple"; //string 클래스만 리터럴 생성 
		System.out.println("필드 c = " + c);

	}

}
