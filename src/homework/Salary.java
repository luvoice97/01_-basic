package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat();
		
        System.out.println("이름 : 1     ");
        String name = scan.next();
        System.out.println("직급:      ");
        String level = scan.next();
		 System.out.print("기본급 : ");
		 int money = scan.nextInt();
		 System.out.print("수당 : ");
		 int bonus = scan.nextInt();
		 System.out.print("세금 : ");
		 int tax = (int)(money*0.03);
			
			System.out.println("*** "+ name + " " + level + " 월급 ***");
			
			int sum = money + bonus - tax;
		
			System.out.println("기본급 :"+df.format(money)+"원");
			System.out.println("수당 : "+df.format(bonus)+"원");
			System.out.println("합계 : "+df.format(money+bonus)+"원");
			System.out.println("세금 : "+df.format(tax)+"원");
			System.out.println("월급 : "+df.format(sum)+"원");
			
		

			scan.close();
	}

}
