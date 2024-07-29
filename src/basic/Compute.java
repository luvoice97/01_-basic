package basic;

import java.text.DecimalFormat;
// 기본 패키지가 java.lang 이기 때문에 아래의 문장은 쓸필요가 없다.
import java.lang.String;
import java.lang.System;

public class Compute {

	public static void main(String[] args) {
		
		short a = 320;
		short b = 258;
		
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		double div = (double)a / b;
		
		System.out.println(a+"+"+b+"="+sum);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+new DecimalFormat().format(mul));
		System.out.println(a+"/"+b+"="+ String.format("%.2f",div));
		
	}

}

/*

*/