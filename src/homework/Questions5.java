package homework;

import java.util.Scanner;

public class Questions5 {

	public static void main(String[] args) {
		// 
		
		  Scanner scan = new Scanner(System.in);
	        
	      
	   
	     
	      int att = 0;
	      int maxatt = 2;
	      int score =0;
	      int point =20;
	      
	      for(int i=0; i<5; i++) {
	      
	      while (att<maxatt) {
	    	  
	    	  int x = (int)(Math.random()*90) + 10;
	 	      int y = (int)(Math.random()*90) + 10;
	 	      int sum = x +y;
	    	  System.out.println(x+"+"+y + "는 얼마일가요");
	    	  
	    	 int ans =scan.nextInt();
	    	 
	    	 if (ans==sum) {
	    		 System.out.println("정답입니다!");
	    		 score += point ;
	    		 break;
	    	 } else {
	    		 att ++;
	    		 if(att<maxatt) {
	    			 System.out.println("틀렷습니다"+(maxatt-att)+"번의 기회가 남았습니다");
	    	 } else
	    		 System.out.println("유감이군요 정답은"+ sum + "입니다");
	    		
	    		  
	    	 
	    	 }
	    		  
	      }
	      
	      }
	      System.out.println("당신의 점수는 " + score + "맞춘 문제는" + score/20);
	      
	      System.out.println("또 하실거면 동전을 넣어주세요");
	      
	}
}





