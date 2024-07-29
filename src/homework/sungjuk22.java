package homework;

import java.util.Scanner;

public class sungjuk22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char name = 'L';
		
		int kor = 85, eng = 90 , math = 100;
		
		int tot= kor + eng + math;
		
		String avg= String.format("%.3f",(double)tot / 3);
		
        System.out.println("\t *** " + name + " 성적표 *** ");
        System.out.println("국어\t영어\t수학\t총점\t평균");
      //System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.3f", avg));
        System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg);
	}

}
