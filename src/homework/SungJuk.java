package homework;

import java.util.Scanner;

public class SungJuk {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 시험 점수 입력
        System.out.print("국어 : ");
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		System.out.println("======= L의 성적표 =======");
		 
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+String.format("%.3f",avg));
			
		 

	}

}

/*
 
 */